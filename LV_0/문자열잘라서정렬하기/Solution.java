package LV_0.문자열잘라서정렬하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String[] solution(String myString) {
        String[] split = myString.split("x");
        List<String> result = new ArrayList<>();

        for (String s : split) {
            // 알파벳만 남기고 나머지 문자 제거
            String lettersOnly = s.replaceAll("[^a-zA-Z]", "");
            if (!lettersOnly.isEmpty()) {
                result.add(lettersOnly);
            }
        }
        Collections.sort(result);
        return result.toArray(new String[0]);
//        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);

    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String myString= "dxccxbbbxaaaa";
        String myString1= "dxxccxxbbbxxaaaa";
        System.out.println(Arrays.toString(T.solution(myString1)));
    }
}
