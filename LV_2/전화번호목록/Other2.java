package LV_2.전화번호목록;

import java.util.HashSet;

public class Other2 {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();
        for (String x : phone_book) {
            set.add(x);
        }

        for (String x : set) {
            for (int i = 1; i < x.length(); i++) {
                if (set.contains(x.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Other2 T = new Other2();
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        System.out.println(T.solution(phone_book1));
    }

}
