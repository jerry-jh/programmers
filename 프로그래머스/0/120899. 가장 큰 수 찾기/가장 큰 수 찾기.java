/*import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] c = array.clone();
        int len = array.length;
        
        Arrays.sort(c);
        answer[0] = c[len-1];
        
        for(int i = 0; i < len; i++){
           if(array[i] == answer[0]){
               answer[1] = i;
           } 
        }
        
        return answer;
    }
}*/

class Solution{
    public int[] solution(int[] array){
        int max = array[0];
        int idx = 0;
        int len = array.length;
        for (int i = 0; i < len; i++){
            if(max < array[i]){
                max = array[i];
                idx = i;
            }
        }    
    return new int[]{max, idx};
    }
}