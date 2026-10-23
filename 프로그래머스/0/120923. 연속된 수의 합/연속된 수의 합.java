class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total/num - (num-1)/2;
        // int start = (total - num * (num - 1) / 2) / num;
        // total이 음수인 경우에는 위와 같이 해결
        for(int i=0; i<num; i++){
            answer[i] = start;
            start++;
        }
        return answer;
    }
}