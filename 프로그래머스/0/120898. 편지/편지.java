class Solution {
    public int solution(String message) {
        int answer = 0;
        message.replace(" ", "");
        answer = message.length()*2;
        return answer;
    }
}