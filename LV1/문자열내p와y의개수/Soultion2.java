package LV1.문자열내p와y의개수;

public class Soultion2 {
    boolean solution(String s) {
        s = s.toLowerCase();  // 매번 toLowerCase하지말고 변수로 지정

        int count = 0; // p와 y를 따로 카운트할 필요없음. 왜냐하면 둘이 같은 개수면 true이니까 +,-해서 0이면 같은 개수임!!

        for (int i = 0; i < s.length(); i++) {
            // split으로 쪼갤필요없이 charAt이용하면 됨
            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }
}
