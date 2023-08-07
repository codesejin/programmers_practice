package LV_1.자연수뒤집어배열로만들기;

public class Solution1 {
    public int[] solution(long n) {

        String[] strings = String.valueOf(n).split("");

        int[] answer = new int[strings.length];

        int idx = 0;
        for (int i = strings.length - 1; i >= 0; i--) {
            answer[idx++] = Integer.parseInt(strings[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.solution(12345);
    }
}
