import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        long sum = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum>budget){
                answer = i;
                break;
            }
        }
        if(answer == 0){
            if(!(d[0]>budget)) answer = d.length;
        }
        return answer;
    }
}