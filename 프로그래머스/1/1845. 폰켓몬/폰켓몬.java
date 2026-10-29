import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            int cnt = map.getOrDefault(i, 0);
            map.put(i, cnt+1);
        }
        int a = nums.length;
        int b = map.size();
        if(a/2 > b){
            answer = b;
        }
        else answer = a/2;
        return answer;
    }
}