class Solution {
    public String solution(String s) {
        
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        int len = sb.length();
        
        int idx = 0;
        for(int i=0; i<len; i++){
            char c = sb.charAt(i);
            if (c == ' ') {
                idx = 0;
            }
            else {
                if(idx%2==0){
                    sb.setCharAt(i, Character.toUpperCase(c));
                }
                idx++;
            }
        }
        return sb.toString();
    }
}