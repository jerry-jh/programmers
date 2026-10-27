class Solution {
    public String solution(int[] food) {
        String answer = "";
        int len = food.length;
        int cnt = 0;
        StringBuilder sb1 = new StringBuilder();
        for(int i=1; i<len; i++){
            cnt = food[i]/2;
            sb1.append(String.valueOf(i).repeat(cnt));
        }
        answer = sb1.toString() + "0" + sb1.reverse().toString();
        return answer;
    }
}

/*
class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i; 
            }
        }

        return answer;
    }
}
*/