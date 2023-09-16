package LV_0.컨트롤제트;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        int minus = 0;
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            if(isNumeric(split[i])) {
                answer += Integer.parseInt(split[i]);
            } else if ( i != 0 && isAlphabetic(split[i])){
                minus += Integer.parseInt(split[i-1]);
            }
        }
        return answer - minus;
    }
    // 문자열이 숫자인지 확인용
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }

    // 문자열이 알파벳인지 확인용
    private boolean isAlphabetic(String str) {
        return str.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "1 2 Z 3";
        String s2 = "10 20 30 40";
        String s3 = "10 Z 20 Z 1";
        String s4 = "10 Z 20 Z";
        String s5 = "-1 -2 -3 Z";
        System.out.println(s.solution(s5));
    }
}
