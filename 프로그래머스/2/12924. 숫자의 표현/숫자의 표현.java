class Solution {
    public int solution(int n) {
        
        int answer = 0;
       
        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=i; j<=n; j++){
                sum += j;
                if (sum >= n) {
                    if (sum == n) answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

/*
// 투 포인터(슬라이딩 윈도우)로도 해결 가능
int left = 1, sum = 0, count = 0;
for (int right = 1; right <= n; right++) {
    sum += right;              // 오른쪽 늘리기
    while (sum > n) {
        sum -= left;           // 넘치면 왼쪽 줄이기
        left++;
    }
    if (sum == n) count++;
}
return count;
*/