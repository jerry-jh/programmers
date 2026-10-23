class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int rm = 0;
        while(!(s.equals("1"))){
            int len = s.length();
            s = s.replace("0", "");
            int lenNew = s.length();
            rm += len-lenNew;
            s = String.valueOf(Integer.toBinaryString(lenNew));
            cnt++;
        }
        
        int[] answer = {cnt, rm};
        return answer;
    }
}