class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        char[] c_num = String.valueOf(num).toCharArray();
        for(int i=0; i<c_num.length; i++){
            if(c_num[i] == k+'0'){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}

/*
class Solution {
    public int solution(int num, int k) {
        int idx = String.valueOf(num).indexOf((char)('0' + k));
        return idx == -1 ? -1 : idx + 1;
    }
}
*/

/*
// 홍희표 풀이, int형 num에 아무 문자열 하나를 붙여서 인덱스를 하나씩 미뤄버리기
// 이렇게 하면 indexOf 사용해도 바로 자리수 추출 가능
class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
*/