package LV_1.크기가작은부분문자열;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();

        List<String> list = new ArrayList<>();
        for (int i = 0; i <= t.length()-len; i++) {
            String substring = t.substring(i, i + len);
            list.add(substring);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (Long.parseLong(list.get(i)) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String t1 = "3141592";
        String p1 = "271";
        String t2 = "3141592";
        String p2 = "31";
        System.out.println(T.solution(t2,p2));
    }
}
