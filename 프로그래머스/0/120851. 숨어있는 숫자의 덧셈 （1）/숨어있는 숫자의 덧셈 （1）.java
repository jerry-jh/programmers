class Solution {
    public int solution(String my_string) {
        
        int len = my_string.length();
        int sum = 0;
        
        for(int i=0; i<len; i++){
            if(Character.isDigit(my_string.charAt(i))){
                sum += (my_string.charAt(i))-'0';
            }
        }
        return sum;
    }
}