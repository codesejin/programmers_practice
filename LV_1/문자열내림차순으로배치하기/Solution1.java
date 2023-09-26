package LV_1.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution1 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splitStr = s.split("");
        Arrays.sort(splitStr, Collections.reverseOrder());
        System.out.println(Arrays.toString(splitStr));
        return Arrays.stream(splitStr).collect(Collectors.joining());
//        for (int i = 0; i < splitStr.length ; i++) {
//            sb.append(splitStr[i]);
//        }
//        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1 solution1 =  new Solution1();
        String s = "Zbcdefg";
        solution1.solution(s);
    }
}
