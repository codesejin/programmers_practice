package LV_0.글자이어붙여문자열만들기;

public class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < index_list.length; i++) {
            sb.append(my_string.charAt(index_list[i]));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string1 ="cvsgiorszzzmrpaqpe";
        int[] index_list1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(T.solution(my_string1, index_list1));
    }
}
