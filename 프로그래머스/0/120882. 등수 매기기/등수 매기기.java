// 관점 바꾸기
// 등수 = 나보다 높은 사람 수 + 1
// 굳이 평균 구하려고 /2 안해도 합으로만 비교해도 됨

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            sum[i] = score[i][0] + score[i][1];
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (sum[j] > sum[i]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }
}