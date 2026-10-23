import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        for(char k : arr){
            if(sb.indexOf(String.valueOf(k)) == -1){
                sb.append(k);
            }
        }
        return new String(sb);
    }
}

/*
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] c = my_string.toCharArray();
        for(int i=0; i<c.length; i++){
            for(int j=i+1; j<c.length; j++){
                if(c[i] == c[j]){
                    c[j] = '0';
                }
            }
        }
        for(int i=0; i<c.length; i++){
            if(c[i] != '0'){
                sb.append(String.valueOf(c[i]));
            }
        }
        return new String(sb);
    }
}
*/