package LV_2.전화번호목록;

import java.util.HashMap;

public class Other {
    // 접두어가 있으면 false / 없으면 true
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i],i);
        }
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0,j))) return false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Other T = new Other();
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        System.out.println(T.solution(phone_book1));
    }
}
