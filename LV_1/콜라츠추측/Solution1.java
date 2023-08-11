package LV_1.콜라츠추측;

public class Solution1 {
    public long solution(long num) {
        long answer = -1;
        if (num == 1) {
            return 0;
        }

        for (long i = 1; i <= 500; i++) {
            if (num != 1 && i == 500) {
                return -1;
            }
            num = calculate(num);
            if (num == 1) {
                answer = i;
                return answer;
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public long calculate (long num) {
        if (num == 1) {
            return  1;
        }
        if (num % 2 == 0) {
            return num / 2;
        } else {
            return num * 3 + 1;
        }
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 16;
        int num3 = 626331;

        Solution1 solution1 = new Solution1();
        long calculate = solution1.solution(num3);
        System.out.println("calculate = " + calculate);
    }
}
