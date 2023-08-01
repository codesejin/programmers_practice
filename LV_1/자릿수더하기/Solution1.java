package LV_1.자릿수더하기;

public class Solution1 {
    public int solution(int n) {
        int answer = 0;

//        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

        String[] split = String.valueOf(n).split("");
        int[] intArray = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            intArray[i] = Integer.parseInt(split[i]);
            answer += intArray[i];
        }

        System.out.println("answer = " + answer);
        return answer;

    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.solution(123);
    }
}
