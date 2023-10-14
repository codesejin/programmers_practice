package LV_0.왼쪽오른쪽;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String[] solution(String[] str_list) {

        String[] answer = {};

        for (int i = 0; i < str_list.length; i++) {
            // 먼저 나오는 문자열이 "l"이라면
            if (str_list[i].equals("l")) return Arrays.copyOfRange(str_list, 0, i);
            // 먼저 나오는 문자열이 "r"이라면
            else if (str_list[i].equals("r")) return Arrays.copyOfRange(str_list, i + 1, str_list.length);
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String[] str_list=  {"u", "u", "l", "r"};
        System.out.println(Arrays.toString(T.solution(str_list)));
    }
}
