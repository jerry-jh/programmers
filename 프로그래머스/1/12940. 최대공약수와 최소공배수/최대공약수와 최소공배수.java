class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = (n*m)/answer[0];
        return answer;
    }
    private int gcd(int x, int y){
        int tmp = 0;
        if(x < y){
            tmp = x;
            x = y;
            y = tmp;
        }
        while(y>0){
            tmp = x;
            x = y;
            y = tmp%y;
            return gcd(x, y);
        }
        return x;
    }
}