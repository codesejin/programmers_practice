package LV_1.소수찾기;

public class Solution2 {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        int answer = 0;

        // 초기화: 모든 수를 소수로 가정하여 isPrime 배열을 true로 초기화합니다.
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘을 사용하여 소수를 찾습니다.
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수의 개수를 세어서 반환합니다.
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int result = solution.solution(10);
        System.out.println("10 이하의 소수 개수: " + result);
    }
}

