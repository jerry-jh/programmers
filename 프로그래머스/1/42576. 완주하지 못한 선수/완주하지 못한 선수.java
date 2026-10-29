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

        // 1. 이름 → 몇 명인지 세는 지도(map) 만들기
        HashMap<String, Integer> map = new HashMap<>();

        // 2. 참가자 이름마다 +1
        for (String name : participant) {
            int count = map.getOrDefault(name, 0);   // 처음 보는 이름이면 0
            map.put(name, count + 1);
        }

        // 3. 완주자 이름마다 -1
        for (String name : completion) {
            int count = map.get(name);               // 완주자는 무조건 참가자라 키가 있음
            map.put(name, count - 1);
        }

        // 4. 값이 0이 아닌 이름 = 완주 못 한 사람
        for (String name : map.keySet()) {
            if (map.get(name) != 0) {
                return name;
            }
        }

        return "";
    }
}