import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = new String[(len+n-1)/n];
        for(int i=0; i<(len+n-1)/n; i++){
            answer[i] = my_str.substring(n*i, Math.min(n*i+n,len));
        }
        return answer;
    }
}