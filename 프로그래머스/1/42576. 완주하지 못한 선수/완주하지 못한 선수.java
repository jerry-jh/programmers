import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        int a = participant.length;
        int b = completion.length;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        
        for(int i=0; i<b; i++){
            if(!(participant[i].equals(completion[i]))){
                return participant[i];
            }
        }
        return participant[a-1];
    }
}