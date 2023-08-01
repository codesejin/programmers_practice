package LV_1.윤년2016년;

public class Solution2 {

    public String getDayName(int a, int b) {
        String answer = "";
       //String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;

        // a월 되기 전까지의 모든 일수 더하기
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        // a월의 b일수 더하기 -1한 이유는
        allDate += (b - 1);

        // 7로 나눠서 String 배열의 인덱스 값으로 정답 할당
        answer = day[allDate % 7];

        return answer;
    }
    public static void main(String[] args)
    {
        Solution2 test = new Solution2();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}
