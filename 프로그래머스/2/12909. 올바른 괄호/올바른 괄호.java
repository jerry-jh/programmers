class Solution {
    boolean solution(String s) {

        int len = s.length();
        int cnt = 0;
        for(int i=0; i<len; i++){
            if(s.charAt(i)=='(') cnt++;
            else if(s.charAt(i)==')'&& cnt>0) cnt--;
            else if(s.charAt(i)==')'&& cnt==0) return false;
        }
        /*
        for (int i = 0; i < len; i++) { 
            if (s.charAt(i) == '(') cnt++;
            else if (--cnt < 0) return false;
        }
        */

        return cnt==0;
    }
}