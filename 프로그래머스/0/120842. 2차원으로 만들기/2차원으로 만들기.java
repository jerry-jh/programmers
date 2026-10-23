class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[][] answer = new int[len/n][n];
        int k = 0;
        for(int i=0; i<len/n; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[k];
                k++;
            }
        }
        return answer;
    }
}