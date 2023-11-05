package LV_0.ad제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length ; i++) {
            if (strArr[i].indexOf("ad") == -1) list.add(strArr[i]);
        }
        return list.stream().toArray(String[]::new);
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String[] strArr = {"there","are","no","a","ds"};
        System.out.println(Arrays.toString(T.solution(strArr)));
    }
}
