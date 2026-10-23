class Solution {
    public long solution(int price, int money, int count) {
        long sum = (long) price * count * (count + 1) / 2;
        return Math.max(0, sum - money);
        /*
        long answer = 0;
        long sum = 0;
        for(int i=1; i<=count; i++){
            sum += price*i;
        }
        answer = sum-money;
        return answer<=0? 0 : answer;
        */
    }
}