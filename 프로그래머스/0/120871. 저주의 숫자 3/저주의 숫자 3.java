class Solution {
    public int solution(int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            k++;
            while (k % 3 == 0 || String.valueOf(k).contains("3")) {
                k++;
            }
        }
        return k;
    }
}