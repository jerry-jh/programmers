import java.util.*;

/*
class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] arr = rsp.toCharArray();
        int len = arr.length;
        for(int i=0; i<len; i++){
            if(arr[i]=='0'){
                answer += "5";
            }else if(arr[i]=='2'){
                answer += "0";
            }else if(arr[i]=='5'){
                answer += "2";
            }
            
        }
        return answer;
    }
}
*/

class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (char c : rsp.toCharArray()) {
            switch (c) {
                case '0': answer.append('5'); break;
                case '2': answer.append('0'); break;
                case '5': answer.append('2'); break;
            }
        }
        return answer.toString();
    }
}