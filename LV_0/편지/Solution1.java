package LV_0.편지;

public class Solution1 {
    public int solution(String message) {
        String[] split = message.split("");
        return split.length * 2;
    }

    public static void main(String[] args) {
        String message = "happy birthday!";
        Solution1 solution1 = new Solution1();
        solution1.solution(message);
    }
}
