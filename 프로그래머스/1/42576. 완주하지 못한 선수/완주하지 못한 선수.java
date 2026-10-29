/*
// 배열 정렬 후 비교
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
*/

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        HashMap<String,Integer> map = new HashMap<>();

        for(String s1 : participant){
            int cnt = map.getOrDefault(s1, 0);
            map.put(s1, cnt+1);
        }
        
        for(String s2 : completion){
            int cnt = map.get(s2);
            map.put(s2, cnt-1);
        }
        
        for(String s3 : map.keySet()){
            if(map.get(s3) !=0) return s3;
        }
        
        return "";
    }
}