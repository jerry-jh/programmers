/*
import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] eq = polynomial.split(" ");
        int x = 0;
        int k = 0;
        // System.out.print(Arrays.toString(eq));
        
        for(int i=0; i<eq.length; i=i+2){
            if(eq[i].contains("x")){
                if(eq[i].equals("x")){
                    x++;
                }
                else{
                    int len = eq[i].length();
                    eq[i] = eq[i].substring(0,len-1);
                    x += Integer.parseInt(eq[i]);
                }
            }
            else{
                k += Integer.parseInt(eq[i]);
            }
        }
        if(x != 0 &&  k != 0){
            if(x == 1){
                answer += "x + ";
                answer += k;
            }
            else{
                answer += x;
                answer += "x + ";
                answer += k;
            }
        }else if(x != 0 &&  k == 0){
            if(x == 1){
                answer += "x";
            }
            else{
                answer += x;
                answer += "x";
            }
        }else if(x == 0 &&  k != 0){
            answer += k;
        }else if(x == 0 &&  k == 0){
            answer = "";
        }
        return answer;
    }
}
*/

class Solution {
    public String solution(String polynomial) {
        int x = 0, k = 0;
        for (String term : polynomial.split(" ")) {
            if (term.equals("+"))
                continue;
            if (term.equals("x")) 
                x++;
            else if (term.contains("x"))
                x += Integer.parseInt(term.replace("x", ""));
            else
                k += Integer.parseInt(term);
        }

        String xTerm = (x == 0) ? "" : (x == 1) ? "x" : x + "x";
        String kTerm = (k == 0) ? "" : String.valueOf(k);

        if (xTerm.isEmpty()) return kTerm;
        if (kTerm.isEmpty()) return xTerm;
        return xTerm + " + " + kTerm;
    }
}