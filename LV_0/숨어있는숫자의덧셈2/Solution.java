package LV_0.숨어있는숫자의덧셈2;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char tmp = my_string.charAt(i);
            if (Character.isDigit(tmp)) {
                num = num * 10 + (tmp - '0');  // 숫자 누적
            } else {
                answer += num;  // 숫자 누적값을 더해주고
                num = 0;  // 초기화

                // 알파벳인 경우는 무시
            }
        }
        answer += num;  // 마지막 숫자 처리
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123Z";
        String my_string3 = "122a3bcd123";
        s.solution(my_string3);
    }
}
