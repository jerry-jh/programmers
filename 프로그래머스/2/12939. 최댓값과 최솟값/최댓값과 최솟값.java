import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strarr = s.split(" ");
        int len = strarr.length;
        int[] intarr = new int[len];
        for(int i=0; i<len; i++){
            intarr[i] = Integer.parseInt(strarr[i]);
        }
        Arrays.sort(intarr);
        answer = intarr[0] + " " + intarr[len-1];
        return answer;
    }
}