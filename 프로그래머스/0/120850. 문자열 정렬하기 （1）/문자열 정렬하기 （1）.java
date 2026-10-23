import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] c = my_string.toCharArray();
        Arrays.sort(c);
        int k = 0;
        for(int i=0; i<c.length; i++){
            if(c[i]>='0' && c[i]<='9'){
                k++;
            }
        } 
        int[] answer = new int[k];
        
        int n = 0;
        for(int i=0; i<c.length; i++){
            if(c[i]>='0' && c[i]<='9'){
                answer[n] = (int)(c[i]-'0');
                n++;
            }
        }
        return answer;
    }
}

/* 스트링 타입에서 먼저 영어 없애기
import java.util.*;

class Solution {
    public int[] solution(String my_string) {

        my_string = my_string.replaceAll("[a-z]","");

        int[] answer = new int[my_string.length()];

        for(int i =0; i<my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }
}
*/