import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        String[][] expr = new String[len][5];
        
        for(int i=0; i<len; i++){
            expr[i] = quiz[i].split(" ");
        }
        // System.out.println(Arrays.deepToString(expr));
        
        for(int i=0; i<len; i++){
            int a = Integer.parseInt(expr[i][0]);
            if(expr[i][1].equals("+")){
                a += Integer.parseInt(expr[i][2]);
                if(a == (Integer.parseInt(expr[i][4]))){
                    answer[i] = "O";
                }
                else answer[i] ="X";
            }
            else{
                a -= Integer.parseInt(expr[i][2]);
                if(a == (Integer.parseInt(expr[i][4]))){
                    answer[i] = "O";
                }
                else answer[i] ="X";
            }
        }
        return answer;
    }
}