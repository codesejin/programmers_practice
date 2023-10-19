package LV_0.접두사인지확인하기;

public class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        int len = is_prefix.length();
        if (my_string.length() < len) return 0;
        for (int i = 0; i < len ; i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) answer = 0;
        }

        // 2줄로 끝내는 방법 1
//        if (my_string.startsWith(is_prefix)) return 1;
//        return 0;
        // 2줄로 끝내는 방법 2
//        int a = my_string.indexOf(is_prefix);
//        return a==0? 1 : 0;
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String my_string = "banana";
        String is_prefix = "ban";
        System.out.println(T.solution(my_string,is_prefix));

    }
}
