/*
import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int len = arr.length;
        for(int i=0; i<len; i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i] -= 'a'-'A';
            }
            else if(arr[i]>='A' && arr[i]<='Z'){
                arr[i] += 'a'-'A';
            }
        }
        return new String(arr);
    }
}
*/
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isUpperCase(c)){
                answer += String.valueOf(c).toLowerCase();
            }else{
                answer += String.valueOf(c).toUpperCase();
            }
        }
        return answer;
    }
}