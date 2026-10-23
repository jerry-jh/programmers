import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] cnt = new int[len];
        int keep = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) cnt[i] = 1;
        }
        for (int i = 0; i < len; i++) {
            if (cnt[i] == 0) keep++;      // 남길 개수 세기
        }

        int[] answer = new int[keep];
        int idx = 0;                       // answer에 채울 위치
        for (int i = 0; i < len; i++) {
            if (cnt[i] == 0) answer[idx++] = arr[i];
        }
        return answer;
    }
}