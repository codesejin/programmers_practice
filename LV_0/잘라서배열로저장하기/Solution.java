package LV_0.잘라서배열로저장하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public String[] solution (String my_str, int n) {
        List<String> list =new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_str.length(); i++) {
            if (i > 0 && i % n == 0 ) {
                list.add(sb.toString());
                sb.delete(0,n);
            }
            sb.append(my_str.charAt(i));
        }
        list.add(sb.toString());
        return list.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(Arrays.toString(T.solution(my_str, n)));
    }
}
