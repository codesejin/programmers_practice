package LV_1.하샤드수;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public boolean solution(int x) {
        boolean answer = false;

        int harshad = 0;
        String[] split = String.valueOf(x).split("");
        int n =split.length;

        for (int i = 0; i < n; i++) {
            harshad += Integer.valueOf(split[i]);
        }

        if (x % harshad == 0) {
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 10;
        Solution1 solution1 = new Solution1();
        boolean solution = solution1.solution(x);
        System.out.println("solution = " + solution);
    }
}
