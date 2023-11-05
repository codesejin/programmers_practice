package LV_0.수조작하기2;

public class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numLog.length-1; i++) {
            int abs = Math.abs(numLog[i] - numLog[i + 1]);
            if (abs == 1 && numLog[i] < numLog[i+1]) sb.append("w");
            else if (abs == 1 && numLog[i] > numLog[i+1]) sb.append("s");
            else if (abs == 10 && numLog[i] < numLog[i+1]) sb.append("d");
            else if (abs == 10 && numLog[i] > numLog[i+1]) sb.append("a");

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(T.solution(numLog));
    }
}
