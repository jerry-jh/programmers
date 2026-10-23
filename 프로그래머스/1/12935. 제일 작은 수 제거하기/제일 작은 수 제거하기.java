public int[] solution(int[] arr) {
    if (arr.length == 1) return new int[]{-1};

    int min = arr[0];
    for (int x : arr) min = Math.min(min, x);

    int[] answer = new int[arr.length - 1];
    int idx = 0;
    for (int x : arr) {
        if (x != min) answer[idx++] = x;
    }
    return answer;
}