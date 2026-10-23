/* class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        for(int i=a; i<=b; i++){
            answer += i;
        }
        return answer;
    }
}
*/


class Solution{
    public int solution(int a, int b){
        return (a+b)*(Math.abs(b-a)+1)/2;
    }
}