/*
import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int len = A.length();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        char[] c = new char[len];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                c[j] = a[(j-i+len)%len];   
            }
            if(Arrays.equals(c, b)){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
*/
class Solution {
    public int solution(String A, String B) {
        return (B + B).indexOf(A);
    }
}