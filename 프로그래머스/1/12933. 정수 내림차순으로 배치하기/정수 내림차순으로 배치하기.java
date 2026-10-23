/*
import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = "" + n;
        int len = s.length();
        int[] arr = new int[len];
        int[] arr2 = new int[len];
        
        for(int i=0; i<len; i++){
            arr[i] = s.charAt(i)-'0';
        }
        Arrays.sort(arr);
        for (int i = len - 1; i >= 0; i--) {
            answer = answer * 10 + arr[i];
        }
        return answer;
    }
}
*/

import java.util.*;

class Solution {
  public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
  }
}