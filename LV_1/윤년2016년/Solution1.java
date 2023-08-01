package LV_1.윤년2016년;

import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution1 {
    public String solution(int a, int b) {
        String answer = "";

        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        // java.time 라이브러리 사용
        LocalDate date = LocalDate.of(2016,a,b);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if(dayOfWeek.getValue() == 1) {
            answer = "MON";
        }else if (dayOfWeek.getValue() == 2) {
            answer = "TUE";
        }else if (dayOfWeek.getValue() == 3) {
            answer = "WED";
        }else if (dayOfWeek.getValue() == 4) {
            answer = "THU";
        }else if (dayOfWeek.getValue() == 5) {
            answer = "FRI";
        }else if (dayOfWeek.getValue() == 6) {
            answer = "SAT";
        }else if (dayOfWeek.getValue() == 7) {
            answer = "SUN";
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.solution(5, 24);
    }
}
