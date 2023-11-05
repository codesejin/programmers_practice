package LV_0.접미사배열;

import java.util.*;

public class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            String tmp = my_string.substring(i,my_string.length());
            list.add(tmp);
        }
        Collections.sort(list);
        return list.stream().toArray(String[]::new);
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "banana";
        System.out.println(T.solution(my_string));
    }
}
