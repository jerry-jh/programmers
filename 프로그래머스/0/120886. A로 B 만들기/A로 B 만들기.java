/*import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    arr2[j] = '0';
                    break;
                }
            }
        }
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]!='0'){
                answer--;
                break;
            }
        }
        return answer;
    }
}*/

import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b) ? 1 : 0;
    }
}