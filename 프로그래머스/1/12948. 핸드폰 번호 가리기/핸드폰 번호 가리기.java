/*
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(phone_number);
        for(int i=0; i<phone_number.length()-4; i++){
            sb.setCharAt(i, '*'); ;
        }
        answer += sb.toString();
        return answer;
    }
}
*/

class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        return "*".repeat(len - 4) + phone_number.substring(len - 4);
    }
}