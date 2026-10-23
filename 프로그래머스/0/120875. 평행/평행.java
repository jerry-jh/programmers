class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if((double)(dots[0][1]-dots[1][1])/(dots[0][0]-dots[1][0])
           == (double)(dots[2][1]-dots[3][1])/(dots[2][0]-dots[3][0])){
            answer = 1;
        }else if((double)(dots[0][1]-dots[2][1])/(dots[0][0]-dots[2][0])
            == (double)(dots[1][1]-dots[3][1])/(dots[1][0]-dots[3][0])){
            answer = 1;
        }else if((double)(dots[0][1]-dots[3][1])/(dots[0][0]-dots[3][0])
            == (double)(dots[1][1]-dots[2][1])/(dots[1][0]-dots[2][0])){
            answer = 1;
        }
        return answer;
    }
}


/*
// isParallel 함수 따로 선언해서 복잡한 코드 줄이기
// 기울기 구한다고 굳이 나눗셈하면 캐스팅 문제 발생할 수 있으니
// 네 좌표의 x성분 차이, y성분 차이를 곱해서 == 연산해보기

// 나눗셈 주의 3가지
// 1. int끼리 나누면 소수점 버려짐 → 캐스팅 필요
// 2. 분모가 0이면 에러(int) 또는 Infinity(double)
// 3. double 비교는 미세한 오차로 같은 값이 다르게 나올 수 있음
// → 비율 비교는 교차 곱셈(a/b == c/d → a*d == c*b)으로

class Solution {
    public int solution(int[][] dots) {
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        return 0;
    }

    private boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
        return (b[1] - a[1]) * (d[0] - c[0]) == (d[1] - c[1]) * (b[0] - a[0]);
    }
}
*/