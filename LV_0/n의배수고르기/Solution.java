package LV_0.n의배수고르기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0)  list.add(numlist[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
//        return list.stream().mapToInt(x -> x).toArray();
    }
}
