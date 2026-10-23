class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order>0){
            int k = order%10;
            if(k==3 || k==6 || k==9){
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}

/*
class Solution {
    public int solution(int order) {
        int answer = 0;

        String str = order+"";

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='3'||c=='6'||c=='9') answer++;
        }

        return answer;
    }
}
*/