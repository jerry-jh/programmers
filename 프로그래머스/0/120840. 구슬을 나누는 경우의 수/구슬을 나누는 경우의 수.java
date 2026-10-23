/*class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = fact(balls)/fact(balls-share)/fact(share);
        return answer;
    }
    private int fact(int a){
        int result = 1;
        for(int i=1; i<=a; i++){
            result *= i;
        }
        return result;
    }
}*/

class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int r = Math.min(share, balls - share);

        for (int i = 1; i <= r; i++) {
            answer = answer * (balls - r + i) / i;
        }
        return (int) answer;
    }
}