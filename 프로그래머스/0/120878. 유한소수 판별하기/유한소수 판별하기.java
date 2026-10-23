class Solution {
    public int solution(int a, int b) {
        int b0 = b/gcd(a, b);
        
        while(b0%2==0){
            b0 = b0/2;
        }
        while(b0%5==0){
            b0 = b0/5;
        }
        
        return b0==1 ? 1 : 2;
        
    }
    private int gcd(int x, int y){
        while(y != 0){
            int tmp = x%y;
            x = y;
            y = tmp;
        }
        return x;
    }
}