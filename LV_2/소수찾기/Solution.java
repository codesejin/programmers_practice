package LV_2.소수찾기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int solution(String numbers) {
        int answer = 0;
        char[] charArray = numbers.toCharArray();
        int[] tmp = new int[charArray.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = charArray[i];
        }
        return answer;
    }

    public boolean checkPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String numbers1 = "17"; // 1 , 7, 17, 71
        String numbers2 = "011";// 0, 1, 11, 110, 101
        System.out.println(T.solution(numbers1));

    }
}
