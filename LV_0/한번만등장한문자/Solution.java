package LV_0.한번만등장한문자;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] split = s.split("");
        int count;
        // 사전 순 정렬
        Arrays.sort(split);

        for (int i = 0; i < split.length; i++) {
            count = 0;
            for (int j = 0; j < split.length; j++) {
                if(split[i].equals(split[j])) {
                    count++;
                }
            }
            if (count == 1) {
                sb.append(split[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcadc";
        System.out.println(solution.solution(s));
    }
}
