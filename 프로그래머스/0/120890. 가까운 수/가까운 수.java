/*class Solution {
    public int solution(int[] array, int n) {
        int a = 0;
        int b = 100;
        int idx_1 = 0;
        int idx_2 = 0;
        int len = array.length;
        for(int i=0; i<len; i++){
            if(array[i]>=n){
                a = array[i] - n;
                if(a<b){
                    b = a;
                    idx_1 = i;
                }
            }
            else{
                a = n - array[i];
                if(a<=b){
                    b = a;
                    idx_2 = i;
                }
            }
        }
        
        return idx_1<=idx_2 ? array[idx_2] : array[idx_1];
    }
}*/

class Solution {
    public int solution(int[] array, int n) {
        int len = array.length;
        int a = 100;
        int idx = 0;
        for(int i=0; i<len; i++){
            if(Math.abs(n-array[i])<a){
                a = Math.abs(n-array[i]);
                idx = i;
            }
            else if(Math.abs(n-array[i])==a){
                if(array[i]<array[idx]){
                    idx = i;
                }
            }
        }
        return array[idx];
    }
}
