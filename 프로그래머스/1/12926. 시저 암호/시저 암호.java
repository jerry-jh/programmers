class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        int len = sb.length();
        for(int i=0; i<len; i++){
            char c = sb.charAt(i);
            if(c>='a' && c<='z')
                sb.setCharAt(i, (char)((c+n-'a')%26+'a'));
            else if(c>='A' && c<='Z')
                sb.setCharAt(i, (char)((c+n-'A')%26+'A'));
        }
        return sb.toString();
    }
}