/* import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        int len = numlist.length;
        
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                int tmp = 0;
                if(Math.abs(numlist[i]-n)>Math.abs(numlist[j]-n)){
                    tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }
        
        for(int i=0; i<len-1; i++){
            if(Math.abs(numlist[i]-n) == Math.abs(numlist[i+1]-n)){
                int tmp = 0;
                if(numlist[i]<numlist[i+1]){
                    tmp = numlist[i];
                    numlist[i] = numlist[i+1];
                    numlist[i+1] = tmp;
                }
            }
        }
        return numlist;
    }
} */

class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int di = Math.abs(numlist[i] - n);
                int dj = Math.abs(numlist[j] - n);
                if (dj < di || (dj == di && numlist[j] > numlist[i])) {
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }
        return numlist;
    }
}