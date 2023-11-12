package LV_2.다음큰숫자;

public class Solution {
    public int solution(int n) {
        int answer = 0, binaryNCnt = 0;
        String binaryN = Integer.toString(n, 2);
        for (int i = 0; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') binaryNCnt++;
        }
        for (int i = n+1; i < n+10; i++) {
            String binaryI = Integer.toString(i, 2);
            int binaryICnt = 0;
            for (int j = 0; j < binaryI.length(); j++) {
                if (binaryI.charAt(j) == '1') binaryICnt++;
            }
            if (binaryNCnt == binaryICnt) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 78;
        System.out.println(T.solution(n));
    }
}
