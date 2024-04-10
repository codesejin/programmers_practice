package LV_1.문자열내p와y의개수;

public class Soultion1 {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        for(int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if (target == 'P' | target == 'p') pCnt ++;
            if (target == 'Y' | target == 'y') yCnt ++;
        }
        return pCnt == yCnt;
    }

    public static void main(String[] args) {
        Soultion1 soultion1 = new Soultion1();
        String s = "pPoooyY";
        soultion1.solution(s);
    }
}
