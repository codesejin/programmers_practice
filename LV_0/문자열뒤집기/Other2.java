package LV_0.문자열뒤집기;

import java.util.List;

public class Other2 {
    public String solution(String my_string, int s, int e) {

        char[] arr = my_string.toCharArray();
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }

        return new String(arr);
    }
}

