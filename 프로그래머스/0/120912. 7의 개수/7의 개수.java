/*
class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int n : array){
            sb.append(n);
        }
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '7'){
                answer++;
            }
        }
        
        return answer;
    }
}
*/

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int n : array) {
            while (n > 0) {
                if (n % 10 == 7){
                    answer++;
                }
                n /= 10;
            }
        }
        return answer;
    }
}