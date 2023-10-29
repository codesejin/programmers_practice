package LV_0.x사이의개수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(String myString) {
        String[] split = myString.split("x",-1);
        System.out.println(Arrays.toString(split));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < split.length ; i++) {
            list.add(split[i].length());
        }
        return list.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String myString1 = "oxooxoxxox";
        String myString2 = "xabcxdefxghi";
        System.out.println(Arrays.toString(T.solution(myString1)));
    }
}
