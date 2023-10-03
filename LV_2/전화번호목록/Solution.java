package LV_2.전화번호목록;

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book); // 사전식 정렬 : [119, 1195524421, 97674223]
        System.out.println(Arrays.toString(phone_book));
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        System.out.println(T.solution(phone_book1));
    }
}