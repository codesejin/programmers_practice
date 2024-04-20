package LV_1.비밀지도;

import java.util.Arrays;

public class Solution {
    // 비상금을 숨겨놓는 장소를 알려줄 비밀지도
    // 비밀지도는 암호호 되어있어서 해독해야함
    // n = 지도의 한 변의 길이
    // arr , arr2 -? 정수 배열로 암호화됨
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1ToString = new String[arr1.length];
        String[] arr2ToString = new String[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            int i1 = arr1[i];
            int i2 = arr2[i];
            String binary1 = Integer.toBinaryString(i1);
            String binary2 = Integer.toBinaryString(i2);
            if (binary1.length() < n) {
                int diff = n - binary1.length();
                for (int j = 0; j < diff; j++) {
                    binary1 = "0" + binary1; // 앞에 0을 붙여줌
                }
            }
            if (binary2.length() < n) {
                int diff = n - binary2.length();
                for (int j = 0; j < diff; j++) {
                    binary2 = "0" + binary2;
                }
            }
            arr1ToString[i] = binary1;
            arr2ToString[i] = binary2;
        }
        System.out.println(Arrays.toString(arr1ToString));
        System.out.println(Arrays.toString(arr2ToString));
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int tmp1 = arr1ToString[i].charAt(j) - '0';
                int tmp2 = arr2ToString[i].charAt(j) - '0';
                if (tmp1 == 1 || tmp2 == 1) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
         int[] arr1 = {9, 20, 28, 18, 11};
         int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(new Solution().solution(n ,arr1, arr2)));
    }
}
