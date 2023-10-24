package LV_0.배열의길이에따라다른연산하기;

public class Solution {
    public int[] solution(int[] arr, int n) {
        boolean checkEvenLen = (arr.length % 2 == 0) ? true : false;
        for (int i = 0; i < arr.length; i ++ ) {
            if (checkEvenLen) {
                if(i % 2 != 0) arr[i] = arr[i] + n;
            } else {
                if(i % 2 == 0) arr[i] = arr[i] + n;
            }
        }
        return arr;
    }
}
