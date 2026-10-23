class Solution {
    public int[] solution(int n) {
        
        int[] arr = new int[n+1];
        int len = arr.length;
        // n값이 계속 바뀌므로 len으로 저장해두기
        
       for(int i = 2; i <= n; i++){
           while(n%i == 0){  // i로 나눈 나머지가 0인 동안
               n = n/i;
               arr[i] += 1;  // i(소인수) 기록
            }
        }
        
        int k = 0;
        for(int i = 0; i < len; i++){ // n 대신 len 사용
            if(arr[i] != 0){
                k = k + 1;  // 소인수 개수 카운트
            }
        }
        
        int[] answer = new int[k]; // 배열 크기를 소인수 개수만큼
        int idx = 0;
        for(int i = 0; i < len; i++){
            if(arr[i] != 0){
                answer[idx] = i;
                idx++;    // 소인수 저장하면 다음 인덱스로
            }
        }
        
        return answer;
    }
}