class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(board[i][j] == 1){
                    for (int dr = -1; dr <= 1; dr++) {
                        for (int dc = -1; dc <= 1; dc++) {
                            int nr = i + dr, nc = j + dc;
                            if (nr >= 0 && nr < len
                                && nc >= 0 && nc < len && board[nr][nc] == 0) {
                                board[nr][nc] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        
        for(int[] row : board)
            for(int x : row)
                if(x == 0) answer ++;
        return answer;
    }
}