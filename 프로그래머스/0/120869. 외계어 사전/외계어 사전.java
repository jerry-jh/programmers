import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        String s = String.join("", spell);
        
        for(int i=0; i<dic.length; i++){
            char[] c = dic[i].toCharArray();
            Arrays.sort(c);
            if(new String(c).equals(s)){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}



/*class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String[] spell_cp = spell.clone();
        
        for(int i=0; i<dic.length; i++){
            spell_cp = spell.clone();
            for(int j=0; j<spell.length; j++){
                if(dic[i].contains(spell_cp[j])){
                    spell_cp[j] = "";
                    if(String.join("",spell_cp).isEmpty()){
                        answer = 1;
                    }
                }
            }
        }
        return answer;
    }
}
*/

/*
// flag로 전부 들어있나 확인
class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            boolean all = true;
            for (String s : spell) {
                if (!word.contains(s)) {
                    all = false;
                    break;
                }
            }
            if (all) return 1;
        }
        return 2;
    }
}
*/


/*
// 정렬한 spell과 dic요소가 같으면 return 1;
import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String target = String.join("", spell);   // "dmos"

        for (String word : dic) {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            if (new String(c).equals(target)) return 1;
        }
        return 2;
    }
}
*/