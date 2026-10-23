class Solution {
    boolean solution(String s) {
        
        s = s.toLowerCase();
        String[] arr = s.split("");
        int cnt_p = 0;
        int cnt_y = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("p")) cnt_p++;
            if(arr[i].equals("y")) cnt_y++;
        }
        return cnt_p == cnt_y;
    }
}