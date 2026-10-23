/*class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            int k = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    k++;
                }
            }
            arr[i] = k;
        }
        
        for(int i=1; i<n+1; i++){
            if(arr[i] >= 3){
                answer++;
            }
        }
        return answer;
    }
}*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        /*for (int i = 1; i <= n; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) k++;
            }
            if (k >= 3) answer++; // 약수 k 3개 이상이면 합성수
        }*/
        
        
        for (int i = 4; i <= n; i++) {
            // 1과 자기자신 i를 제외하고 나누어 떨어지는 게 있다면
            // 그 수는 합성수임
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}