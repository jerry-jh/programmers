class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=1; i<len; i++){
            if(sb.charAt(i)>='a' && sb.charAt(i) <= 'z'
               && sb.charAt(i-1) == ' '){
                sb.setCharAt(i, (char)(sb.charAt(i)-('a'-'A')));
            }
        }
        if(sb.charAt(0)>='a' && sb.charAt(0)<='z')
            sb.setCharAt(0, (char)(sb.charAt(0)-('a'-'A')));
        answer = sb.toString();
        return answer;
    }
}