package LV_0.팩토리얼;

public class Solution1 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            if (n >= factorial(i)) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }
    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number-1);
        }
    }

    public static void main(String[] args) {
        int n1 = 3628800;
        int n2  = 7;
        Solution1 solution1 = new Solution1();
        solution1.solution(n1);
    }
}
