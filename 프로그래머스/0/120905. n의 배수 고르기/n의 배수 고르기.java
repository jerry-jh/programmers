/*class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int len = numlist.length;
        int k = 0;
        for(int i = 0; i < len; i++){
            if(numlist[i]%n == 0){
                k++;
            }
        }
        
        int[] answer = new int[k];
        int idx = 0;
        for(int i = 0; i < len; i++){
            if(numlist[i]%n == 0){
                answer[idx] = numlist[i];
                idx++;
            }
        }
        return answer;
    }
}*/


import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}