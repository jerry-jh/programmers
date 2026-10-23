class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int len_row = arr1.length;
        int len_col = arr1[0].length;
        int[][] answer = new int[len_row][len_col];
        for(int i=0; i<len_row; i++){
            for(int j=0; j<len_col; j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}