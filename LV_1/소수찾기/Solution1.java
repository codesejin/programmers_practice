package LV_1.소수찾기;

public class Solution1 {
    public int solution(int n) {
        // 정확성 56.3점, 효율성 0점으로 테스트 실패
        // 시간 복잡도는 O(n^2)로, 더 큰 입력값에 대해서는 성능이 저하가 와서 시간초과로 실패
        // n이 작을 때는 문제가 없지만, n이 매우 큰 경우에는 처리 시간이 증가하게 됩니다.
        // 예를 들어, n이 10,000보다 큰 경우에는 이미 수백만 번의 연산을 해야 하므로 처리에 상당한 시간이 소요됩니다.
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i ; j++) {
                if (i % j == 0) {
                    count++;
                    System.out.println("i = " + i + "  j = " + j);
                    System.out.println("count = " + count);
                }
            }
            if (count==1) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.solution(10);
    }
}
