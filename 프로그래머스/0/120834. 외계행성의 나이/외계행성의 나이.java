class Solution {
    public String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        int len = str.length();
        for(int i = 0; i < len; i++){
            answer += (char)(str.charAt(i)+49);
        }
        return answer;
    }
}