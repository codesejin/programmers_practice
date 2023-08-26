package LV_0.가까운수;

public class Solution {
    public int solution(int[] array, int n) {

        int absMin = 100; // 절대값 최소값 구하기 위한 초기화
        int numMin = 100; // 절대값 최소값 구하기 위한 초기화

        // 절대값 최솟값 찾기
        for (int i = 0; i < array.length; i++) {
            int temp = Math.abs(n - array[i]);
            if (absMin >= temp) {
                absMin = temp;
            }
        }
        // 절대값 최소값과 같은 절대값을 가지면서 더 작은 숫자 찾기
        for (int findNum : array) {
            int abs = Math.abs(n - findNum);
            if (absMin == abs && numMin > findNum) {
                numMin = findNum;
            }
        }
        return numMin;
    }


    public static void main(String[] args) {
        int[] array0 = {1,2,4,1};
        int n0 = 3;
        int[] array1 = {1,4,2,1};
        int n1 = 3;
        int[] array2 = {3, 10, 28};
        int n2 = 20;
        int[] array3 = {1,2};
        int n3 = 1;
        int[] array4 = {10, 11, 12};
        int n4 = 13;

        Solution s = new Solution();
        s.solution(array0, n0);
    }
}
