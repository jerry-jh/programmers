/*
class Solution {
    public String solution(String bin1, String bin2) {
        int b1 = Integer.parseInt(bin1);
        int b2 = Integer.parseInt(bin2);
        b1 = to10(b1);
        b2 = to10(b2);
        return to2(b1+b2);
    }
    private int to10(int x){
        int y = 1;
        int z = 0;
        while(x>0){
            z += x%10 * y;
            x /= 10;
            y *= 2;
        }
        return z;
    }
    private String to2(int x){
        String y = "";
        if (x == 0){
            return "0";
        }
        else{
            while(x>0){
                y += x%2;
                x /= 2;
            }
            StringBuilder sb = new StringBuilder(y);
            sb.reverse();
            return new String(sb);
        }
    }
}
*/

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";

        int a = Integer.parseInt(bin1,2);  // 2진수를 10진수로
        int b = Integer.parseInt(bin2,2);
        answer = Integer.toBinaryString(a+b);  // 10진수를 2진수로
        return answer;
    }
}