package LV_0.꼬리문자열;

public class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) sb.append(str_list[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        System.out.println(T.solution(str_list, ex));
    }
}
