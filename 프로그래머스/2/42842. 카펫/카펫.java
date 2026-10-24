class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int cnt = brown+yellow;
        for(int i=3; i<cnt; i++){
            int j = cnt/i;
            if(cnt%i==0){
                if((i*2 + 2*(j-2))==brown && (i-2)*(j-2)==yellow){
                    answer[0] = cnt/i;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}