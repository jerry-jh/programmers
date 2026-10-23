class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int a=i; a<=j; a++){
            sb.append(a);
        }
        int len = sb.length();
        for(int b=0; b<len; b++){
            if(sb.charAt(b)==k+'0'){
                answer++;
            }
        }
        return answer;
    }
}