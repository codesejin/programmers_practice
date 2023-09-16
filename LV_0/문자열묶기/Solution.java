package LV_0.문자열묶기;

import java.util.*;

public class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int strArrLen = strArr.length;

        Set<Integer> set = new HashSet<>(); // 문자열 길이만 저장하기 위한 set변수
        int maxForArrayLength = Integer.MIN_VALUE; // 배열 크기를 정해줄 최대값 구하기

        // 문자열 길이만 저장
        for (int i = 0; i < strArrLen; i++) {
            int len = strArr[i].length();
            if (len > maxForArrayLength) maxForArrayLength = len;
            set.add(len);
        }
        // 배열의 인덱스값과 일치하는 문자길이일 경우 ++
        int[] array = new int[maxForArrayLength+1];
        for (int i = 0; i < strArrLen; i++) {
            for (int j = 1; j <= set.size(); j++) {
                if (strArr[i].length() == j) {
                    array[j] ++;
                }
            }
        }

        int arrayLen = array.length;
        for (int i = 0; i < arrayLen; i++) {
            if (answer < array[i]) answer = array[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strArr = {"a","bc","d","efg","hi"};
        System.out.println(s.solution(strArr));
    }
}
