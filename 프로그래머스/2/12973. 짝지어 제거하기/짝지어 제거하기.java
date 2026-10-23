import java.util.*;

class Solution
{
    public int solution(String s){
        int len = s.length();
        Deque<Character> stack = new ArrayDeque<>();
        char a = 0;
        char b = 0;
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek()==c) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}