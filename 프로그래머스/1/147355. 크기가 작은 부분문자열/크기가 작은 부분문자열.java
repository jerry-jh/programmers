class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String s = "";
        int lenT = t.length();
        int lenP = p.length();
        /*
        long longP = Long.parseLong(p);
        for(int i=0; i<=lenT-lenP; i++){
            s = t.substring(i, i+lenP);
            if(Long.parseLong(s) <= longP) answer++;
        }
        */
        for (int i = 0; i <= lenT - lenP; i++) {
            if (t.substring(i, i + lenP).compareTo(p) <= 0) answer++;
        }
        return answer;
    }
}