class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int cnt = brown+yellow;
        for(int i=3; i<cnt; i++){
            int j = cnt/i;
            if(cnt%i==0){
                if((i*2 + 2*(j-2))==brown && (i-2)*(j-2)==yellow){
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}


/*
int total = brown + yellow;
for (int h = 3; h * h <= total; h++) {
    if (total % h != 0) continue;
    int w = total / h;
    if ((w - 2) * (h - 2) == yellow) return new int[]{w, h};
}
return new int[0];
*/