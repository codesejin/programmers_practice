package LV_2.가장큰수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String solution(int[] numbers) {
        List<Integer> increase = new ArrayList<>();
        List<Integer> decrease = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            increase.add(numbers[i]);
            decrease.add(numbers[i]);
        }
        Collections.sort(increase);
        Collections.sort(decrease, Collections.reverseOrder());
//        int total = (numbers.length - 1) * numbers.length;
        StringBuilder sb = new StringBuilder();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = numbers[i];
            sb.append(tmp);
            for (int j = 0; j < increase.size(); j++) {
                if (tmp != increase.get(j)) {
                    sb.append(increase.get(j));
                }
            }
            result.add(Integer.parseInt(sb.toString()));
            sb.delete(0,sb.length());
            sb.append(tmp);
            for (int j = 0; j < decrease.size(); j++) {
                if (tmp != decrease.get(j)) {
                    sb.append(decrease.get(j));
                }
            }
            result.add(Integer.parseInt(sb.toString()));
            sb.delete(0,sb.length());
        }
        System.out.println(result);
        Collections.sort(result,Collections.reverseOrder());

        return result.get(0).toString();
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};
        System.out.println(T.solution(numbers2));
    }
}
