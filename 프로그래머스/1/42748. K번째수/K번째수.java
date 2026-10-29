import java.util.*;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
       
        int len = commands.length;
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++){
            
            int len2 = commands[i][1]-commands[i][0]+1;
            int[] arr = new int[len2];
            int k = commands[i][0]-1;
            
            for(int j=0; j<len2; j++){
                arr[j] = array[k];
                k++;
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        
        return answer;
    }
}