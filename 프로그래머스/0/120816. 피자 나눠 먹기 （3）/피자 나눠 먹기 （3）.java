class Solution {
    public int solution(int slice, int n) {
        int answer = n / slice;
        double k = (double)n / slice;
        
        if(k == answer)
            return answer;
        else
            return answer + 1;
    }
}