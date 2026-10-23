class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int len = babbling.length;
        String[] s = {"aya", "ye", "woo", "ma"};
        for(int i=0; i<len; i++){
            for(int j=0; j<4; j++){
                if(babbling[i].contains(s[j])){
                    babbling[i] = babbling[i].replace(s[j], ",");
                }
            }
        }
        for(int i=0; i<len; i++){
            if(babbling[i].replace(",", "").isEmpty())
                answer++;
        }
        
        return answer;
    }
}


/*
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            for (String w : words) {
                b = b.replace(w, ",");
            }
            if (b.replace(",", "").isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
*/