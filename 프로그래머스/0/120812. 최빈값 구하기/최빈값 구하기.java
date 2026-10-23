/*class Solution {
    public int solution(int[] array) {

        int[] count = new int[1000];
        int len_a = array.length;
        int len_c = count.length;
        
        for(int i = 0; i < len_a; i++){
            count[array[i]]++;
        } // 빈도수 카운트
        
        int max = 0;
        for(int i = 0; i < len_c; i++){
            if(max < count[i]){
                max = count[i];
            } 
        } // 가장 높은 빈도수 max로 저장
        
        int num = 0;
        int answer =0;
        for(int i = 0; i < len_c; i++){
            if(max == count[i]){
                num ++;
                answer = i; // 마지막으로 찾은 최빈값을 저장
            }
        }
        return num == 1 ? answer : -1;
    }
}*/

import java.util.*;

class Solution{
    public int solution(int[] array){
        
        // 빈도수 세기, key = 값, value = 나온 횟수
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : array){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        // 가장 높은 빈도수 찾기
        int max = 0;
        for(int v : map.values()){
            if(max < v){
                max = v;
            }
        }
        
        // 최대 빈도수 가진 값들이 몇개인지?
        int num = 0;
        int answer = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == max){
                num++;
                answer = e.getKey();
            }
        }
        
        // 최빈값이 1개면 그대로 answer 리턴
        // 최빈값이 여러개면 -1 리턴
        return num == 1 ? answer : -1;
    }
}