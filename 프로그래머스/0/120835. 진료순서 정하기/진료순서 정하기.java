/*import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        
        int[] arr = emergency.clone();
        int len = emergency.length;
        int[] answer = new int[len];
        Arrays.sort(arr);
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(arr[i]==emergency[j]){
                    answer[j] = len-i;
                }
            }
        }
        return answer;
    }
}*/

class Solution{
    public int[] solution(int[] emergency){       
        int len = emergency.length;
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++){
            int rank = 1;
            for(int j=0; j<len; j++){
                if(emergency[i]<emergency[j]){ // 부등호 잘 생각해보기
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}