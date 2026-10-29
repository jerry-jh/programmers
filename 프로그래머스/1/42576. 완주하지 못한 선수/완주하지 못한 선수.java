import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        int num = completion.length;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        
        for(int i=0; i<num; i++){
            if(!(participant[i].equals(completion[i]))){
                return participant[i];
            }
        }
        return participant[num];
    }
}