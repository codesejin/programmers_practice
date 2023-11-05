package LV_0.약수구하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);
        }
        return list.stream().mapToInt( i -> i).toArray();
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 24;
        System.out.println(T.solution(n));
    }
}
