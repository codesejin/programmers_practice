package LV_0.k의개수;

public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        int[] ints = new int[j-i+1];
        int idx = 0;
        for (int l = i; l <= j; l++) {
            ints[idx++] = l;
        }

        for (int l = 0; l < ints.length; l++) {
            int target = ints[l];
            for (int m = 0; m < String.valueOf(target).length(); m++) {
                int unit = Integer.parseInt(String.valueOf(String.valueOf(ints[l]).charAt(m)));
                if (unit == k)
                    answer ++;
            }

        }
        System.out.println("answer = " + answer);
        return answer;
    }
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        Solution s = new Solution();
        s.solution(i,j,k);
    }
}
