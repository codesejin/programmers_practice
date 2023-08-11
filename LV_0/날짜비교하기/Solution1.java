package LV_0.날짜비교하기;

import java.time.LocalDate;

public class Solution1 {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        LocalDate dateTime1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateTime2 = LocalDate.of(date2[0], date2[1], date2[2]);

        if (dateTime1.isBefore(dateTime2)) {
            answer = 1;
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
//        int[] date1 = {2021, 12, 28};
//        int[] date2 = {2021, 12, 29};

        int[] date1 = {2023, 8, 23};
        int[] date2 = {2023, 9, 1};


        Solution1 solution1 = new Solution1();
        solution1.solution(date1,date2);
    }
}
