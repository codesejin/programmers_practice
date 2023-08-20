package LV_1.서울에서김서방찾기;

import java.util.Arrays;

public class Solution1 {
    public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") +"에 있다";
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        Solution1 solution1 = new Solution1();
        solution1.solution(seoul);
    }
}
