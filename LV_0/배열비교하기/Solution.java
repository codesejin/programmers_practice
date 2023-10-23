package LV_0.배열비교하기;

public class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int num1 = 0, num2 = 0;
        if(arr1.length > arr2.length) return 1;
        else if (arr2.length > arr1.length) return -1;
        else {
            for(int i = 0; i < arr1.length; i++) {
                num1 += arr1[i];
                num2 += arr2[i];
            }
            if (num1 > num2) return 1;
            else if (num2 > num1) return -1;
        }
        return answer;
    }
}
