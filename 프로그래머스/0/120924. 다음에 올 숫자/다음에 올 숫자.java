class Solution {
    public int solution(int[] common) {
        int len = common.length;
        int answer = 0;
        
        // 등차수열이면
        if(common[1]-common[0] == common[2]-common[1]){
            int d = common[1]-common[0];
            answer = common[len-1] + d; 
        }
        // 등비수열이면
        else if(common[0]*common[2] == common[1]*common[1]){
            int r = common[1]/common[0];
            answer = common[len-1] * r;
        }
        
        return answer;
    }
}