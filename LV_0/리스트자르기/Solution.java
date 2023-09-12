package LV_0.리스트자르기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        // n은 1~4까지 고정
        if ( n == 1 ) {
            int b = slicer[1];
            return Arrays.stream(num_list, 0, b).toArray();
        } else if ( n == 2 ) {
            int a = slicer[0];
            int len = num_list.length;
            return Arrays.stream(num_list, a, len).toArray();
        } else if ( n == 3 ) {
            int a = slicer[0];
            int b = slicer[1];
            return Arrays.stream(num_list, a, b + 1).toArray();
        } else {
            int a = slicer[0];
            int b = slicer[1];
            int c = slicer[2];
            return IntStream.range(a, b+1)
                    .filter(i -> (i - a) % c == 0)
                    .map(i -> num_list[i])
                    .toArray();
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int n1 = 3;
        int n2 = 4;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(s.solution(1, slicer, num_list)));
    }
}
