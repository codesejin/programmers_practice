package LV_0.문자열정수의합;

public class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] charArray = num_str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            answer += charArray[i] - '0';
        }
        return answer;
//        return Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();
//        return numStr.chars().map(c -> c - 48).sum();
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String num_str = "123456789";
        System.out.println(T.solution(num_str));
    }
}
