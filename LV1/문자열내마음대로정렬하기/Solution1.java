package LV1.문자열내마음대로정렬하기;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution1 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            System.out.println("strings[i].charAt(n) = " + strings[i].charAt(n));
            System.out.println("strings[i] = " + strings[i]);
            list.add(strings[i].charAt(n) + strings[i]);
            System.out.println("list = " + list);
        }

        // 정렬
        Collections.sort(list);
        System.out.println("list = " + list);

        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }


        return answer;
    }

    public static void main(String[] args) {

        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        Solution1 solution = new Solution1();
        solution.solution(strings, n);
    }
}
