package LV_1.신규아이디추천;

public class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1단계
        new_id = new_id.toLowerCase();
        // 2단계
        for (char c : new_id.toCharArray()) {
            if (Character.isDigit(c) || Character.isAlphabetic(c)
                    || c == '-' || c == '_' || c == '.') {
                answer += c;
            }
        }
        // 3단계
        while (answer.indexOf("..") != -1) {
            answer = answer.replace("..", ".");
        }
        // 4단계
        if (!answer.isEmpty() && answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        if (!answer.isEmpty() && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }
        // 5단계
        if (answer.isEmpty()) {
            answer += "a";
        }
        // 6-1단계
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
        }
        // 6-2단계
        if (answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, 14);
        }
        // 7단계
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }
        return answer;
    }
}
