package LV_1.문자열내p와y의개수;

public class Solution3 {
    boolean solution(String s) {
        s = s.toUpperCase();
        // 람다 사용
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
