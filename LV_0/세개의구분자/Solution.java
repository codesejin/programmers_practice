package LV_0.세개의구분자;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        char[] charArray = myStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'b' || charArray[i] == 'c') {
                if (!sb.isEmpty()) {
                    list.add(sb.toString());
                }
                sb.delete(0,sb.length());
            } else {
                sb.append(charArray[i]);
            }
        }
        if (!sb.isEmpty()) {
            list.add(sb.toString());
        }

        if (list.isEmpty()) {
            String[] answer = {"EMPTY"};
            return answer;
        }
        // 리스트를 배열로 만들어주기 위함
        // list.toArray하면 Object[]로 반환되는데.. 다른 간단한 방법없을까?
        int idx = 0;
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[idx++] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String myStr1 = "baconlettucetomato";
        String myStr2 = "abcd";
        String myStr3 = "cabab";
        System.out.println(Arrays.toString(s.solution(myStr1)));

    }
}
