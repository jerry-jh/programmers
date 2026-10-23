/*class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int len = cipher.length();
        for(int i=1; i<=len/code; i++){
            answer += cipher.charAt(code*i-1);
        }
        return answer;
    }
}*/

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int len = cipher.length();
        for(int i=code-1; i<len; i+=code){
            answer += cipher.charAt(i);
        }
        return answer;
    }
}