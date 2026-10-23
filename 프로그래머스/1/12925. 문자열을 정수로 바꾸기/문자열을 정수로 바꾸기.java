/*
class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.contains("-")){
            s = s.substring(1, s.length());
            answer -= Integer.parseInt(s);
        }
        else answer = Integer.parseInt(s);
        return answer;
    }
}
*/ 

class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}