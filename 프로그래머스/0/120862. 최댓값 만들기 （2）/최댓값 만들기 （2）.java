class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE; // 이렇게 쓰는 법 기억하기
        int len = numbers.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(i!=j){
                    if(max <= numbers[i]*numbers[j]){
                        max = numbers[i]*numbers[j];   
                    }    
                }
            }
        }        
        return max;
    }
}