class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        for(int i=1; i<=500; i++){
            if(n%2==0){
                n = n/2;
                answer++;
                if(n==1) break;
            }
            else{
                n = n*3 + 1;
                answer++;
                if(n==1) break;
            } 
        }
        if(num==1) answer = 0;
        if(answer==500) answer = -1;
        return answer;
    }
}