/*
// 재귀로 하면 시간초과
class Solution {
    public int solution(int n) {
        int answer = fib(n)%1234567;
        return answer;
    }
    private int fib(int x){
        return x>=2? fib(x-1) + fib(x-2) : x; 
    }
}
*/

class Solution {
    public int solution(int n) {
        int n0 = 0;
        int n1 = 1;
        int fib = 0;
        int k = 1234567;
        for(int i = 2; i<=n; i++){
            fib = (n0 + n1)%k;
            n0 = n1;
            n1 = fib;
        }
        return fib;
    }
}