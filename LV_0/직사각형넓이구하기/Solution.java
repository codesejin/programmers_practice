package LV_0.직사각형넓이구하기;

class Solution {
    public int solution(int[][] dots) {
        int maxHorizontal = Integer.MIN_VALUE , maxVertical = Integer.MIN_VALUE;
        int minHorizontal = Integer.MAX_VALUE, minVertical = Integer.MAX_VALUE;

        for (int i = 0; i < dots.length; i++) {
            maxHorizontal = Math.max(maxHorizontal, dots[i][0]);
            minHorizontal = Math.min(minHorizontal, dots[i][0]);
            maxVertical = Math.max(maxVertical, dots[i][1]);
            minVertical = Math.min(minVertical, dots[i][1]);
        }
        return (maxHorizontal-minHorizontal) * (maxVertical-minVertical);
    }
}