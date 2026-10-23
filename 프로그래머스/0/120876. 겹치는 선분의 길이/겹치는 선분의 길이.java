class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[200];
        for(int i=0; i<3; i++){
            lines[i][0] += 100;
            lines[i][1] += 100;
        }
        for(int i=0; i<3; i++){
            for(int j=lines[i][0]; j<lines[i][1]; j++){
                count[j]++;
            }
        }
        for(int i=0; i<count.length; i++){
            if(count[i]>1){
                answer++;
            }
        }
        return answer;
    }
}