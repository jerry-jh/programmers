/*
class Solution {
    public String solution(String letter) {

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] parts = letter.split(" ");
        int len_p = parts.length;
        int len_m = morse.length;

        char[] answer = new char[len_p];

        for(int i=0; i<len_p; i++){
            for(int j=0; j<len_m; j++){
                if(parts[i].equals(morse[j])){
                    answer[i] = (char)(j+'a');
                }
            }
        }

        return new String(answer);
    }
}
*/
class Solution {
    public String solution(String letter) {
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = letter.split(" ");
        int len_w = word.length;
        int len_m = morse.length;
        String answer = "";
        
        for(int i=0; i<len_w; i++){
            for(int j=0; j<len_m; j++){
                if(word[i].equals(morse[j])){
                    answer += (char)(j+'a');
                }
            }
        }
    
        return answer;
    }
}