package LV_0.문자열돌리기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (Character x : a.toCharArray()) {
            System.out.println(x);
        }
    }
}
