package LV_1.숫자문자열과영단어;

import java.util.*;
public class Solution {
    static Map<String, Integer> map = new HashMap<>();

    public int solution(String s) {
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        int answer = 0;
        StringBuilder strAnswer = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if(!Character.isDigit(target)) {
                sb.append(target);
                if (map.containsKey(sb.toString())) {
                    strAnswer.append(map.get(sb.toString()));
                    sb.delete(0,sb.length());
                }
            } else {
                strAnswer.append(target);
            }
        }
        return Integer.parseInt(strAnswer.toString());
    }
}
