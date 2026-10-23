/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer += i;
            }
        }
        return answer;
    }
}
*/
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                answer += i;
                if (i != n / i) answer += n / i;
                // 4×4=16처럼 같은 수면 한 번만
            }
        }
        return answer;
    }
}