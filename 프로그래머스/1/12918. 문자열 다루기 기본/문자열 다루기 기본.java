class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int len = s.length();
        if(len==4 || len==6){
            s = s.replaceAll("[0-9]", "");
            return s.isEmpty();
        }
        return answer;
    }
}

/*
if (len != 4 && len != 6) return false;
for (char c : s.toCharArray()) {
    if (!Character.isDigit(c)) return false;
}
return true;
*/