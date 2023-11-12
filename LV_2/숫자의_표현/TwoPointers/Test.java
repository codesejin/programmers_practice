package LV_2.숫자의_표현.TwoPointers;

public class Test {
    public int solution(int n) {
        int answer = 0, lt = 1, sum = 0;
        for (int rt = 1; rt <= n; rt++) {
            sum += rt;
            if (sum == n) answer ++;
            while(sum >= n) {
                sum -= lt;
                lt++;
                if (sum == n) answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Test T = new Test();
        int n = 15;
        System.out.println(T.solution(n));
    }
}
