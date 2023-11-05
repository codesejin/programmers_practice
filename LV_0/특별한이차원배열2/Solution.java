package LV_0.특별한이차원배열2;
public class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) answer = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[][] arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
        System.out.println(T.solution(arr));
    }
}
