package LV_0.세개의구분자;

import java.util.Arrays;

public class FailedSolution {
    public String[] solution(String myStr) {
        String replace = myStr.replace("a", " ").replace("b", " ").replace("c", " ").trim();
        String[] split = replace.split(" ");
        for (String s : split) {
            if (s.isEmpty()) split[0] = "EMPTY";
        }
        return split;
    }

    public static void main(String[] args) {
        FailedSolution s = new FailedSolution();
        String myStr1 = "baconlettucetomato";
        String myStr2 = "abcd";
        String myStr3 = "cabab";
        System.out.println(Arrays.toString(s.solution(myStr3)));

    }
}
