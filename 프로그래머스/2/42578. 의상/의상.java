import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        int answer = 1;
        int len = clothes.length;
        
        for(int i=0; i<len; i++){
            int cnt = map.getOrDefault(clothes[i][1], 0);
            map.put(clothes[i][1], cnt+1);
        }
        
        for(int n : map.values()){
            answer *= (n+1);
        }
        
        answer--;
        
        return answer;
    }
}