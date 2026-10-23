class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int len = numbers.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++){
            if(direction.equals("right")){
                answer[i] = numbers[(i-1+len)%len];
            }
            else if (direction.equals("left")){
                answer[i] = numbers[(i+1)%len];
            }
        }
        return answer;
    }
}