package LV_1.최소직사각형;

public class Solution {
    public int solution(int[][] sizes) {

        int hMax = Integer.MIN_VALUE; // 수평
        int vMax = Integer.MIN_VALUE; // 수직
        for (int i = 0; i < sizes.length; i++) {
            int h = Math.min(sizes[i][0], sizes[i][1]);
            int v = Math.max(sizes[i][0], sizes[i][1]);
            hMax=Math.max(hMax,h);
            vMax=Math.max(vMax,v);
        }
        return vMax*hMax;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[][] sizes1 = {{60, 50},
                           {30, 70},
                           {60, 30},
                            {80, 40}};
        System.out.println(T.solution(sizes1));
    }
}
