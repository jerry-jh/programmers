class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=10; i++){
            if(n/i>0){
                n /= i;
                answer = i;
            }
        }
        return answer;
    }
}

/*

class Solution {
    public int solution(int n) {
        int i = 1;
        int fact = 1;
        while (fact * (i + 1) <= n) {
            i++;
            fact *= i;
        }
        return i;
    }
}

*/