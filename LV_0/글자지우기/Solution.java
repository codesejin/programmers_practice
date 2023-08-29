package LV_0.글자지우기;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);
        int offset = 0; // 삭제된 문자로 인한 인덱스 오차 보정
        for (int i = 0; i < indices.length; i++) {
            int adjustedIndex = indices[i] - offset;
                sb.deleteCharAt(adjustedIndex);
                offset++; // 삭제로 인한 인덱스 오차 업데이트

        }
        return sb.toString();
    }


    public static void main(String[] args) {

        Solution s = new Solution();
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        s.solution(my_string, indices);
    }
}
