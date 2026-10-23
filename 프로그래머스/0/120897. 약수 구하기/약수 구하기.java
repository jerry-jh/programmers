class Solution {
    public int[] solution(int n) {
        int k = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0)
                k += 1;
        }
        int[] answer = new int[k];
        int tmp = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[tmp]=i;
                tmp++;
            }
        }
        return answer;
    }
}