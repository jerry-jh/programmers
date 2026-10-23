/*
// 개노답 풀이
import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int len = s.length();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        if(len != 1){
        if(arr[0] != arr[1]){
            answer.append(String.valueOf(arr[0]));
        }
        for(int i=1; i<len-1; i++){
            if(arr[i] != arr[i+1] && arr[i] != arr[i-1]){
                answer.append(String.valueOf(arr[i]));
            }
        }
        if(arr[len-1] != arr[len-2]){
            answer.append(String.valueOf(arr[len-1]));
        }
        return new String(answer);
    }
        else{
            answer.append(String.valueOf(arr[0]));
            return new String(answer);
        }
    }
}
*/

class Solution {
    public String solution(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                sb.append((char) ('a' + i));
            }
        }
        return sb.toString();
    }
}