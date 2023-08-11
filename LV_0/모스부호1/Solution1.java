package LV_0.모스부호1;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> morse = new HashMap<>();
        morse.put(".-","a");
        morse.put("-...","b");
        morse.put("-.-.","c");
        morse.put("-..","d");
        morse.put(".","e");
        morse.put("..-.","f");
        morse.put("--.","g");
        morse.put("....","h");
        morse.put("..","i");
        morse.put(".---","j");
        morse.put("-.-","k");
        morse.put(".-..","l");
        morse.put("--","m");
        morse.put("-.","n");
        morse.put("---","o");
        morse.put(".--.","p");
        morse.put("--.-","q");
        morse.put(".-.","r");
        morse.put("...","s");
        morse.put("-","t");
        morse.put("..-","u");
        morse.put("...-","v");
        morse.put(".--","w");
        morse.put("-..-","x");
        morse.put("-.--","y");
        morse.put("--..","z");

        String[] split = letter.split(" ");
        int splitLength = split.length;
        for (int i = 0; i < splitLength ; i++) {
            answer += morse.get(split[i]);
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        Solution1 solution1 = new Solution1();

        solution1.solution(letter);
    }
}
