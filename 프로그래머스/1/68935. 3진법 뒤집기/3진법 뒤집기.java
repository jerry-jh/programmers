class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder n3 = new StringBuilder(Integer.toString(n, 3));
        n3.reverse();
        answer = Integer.parseInt(n3.toString(), 3);
        return answer;
    }
}