package LV_1.문자열내p와y의개수;

public class Soultion1 {
    boolean solution(String s) {
        boolean answer = true;

        String[] splitStr = s.split("");
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < splitStr.length; i++) {
            if ("p".equals(splitStr[i].toLowerCase())) {
                pCount += 1;
            } else if ("y".equals(splitStr[i].toLowerCase())) {
                yCount += 1;
            }
        }

        if (pCount != yCount) {
            answer = false;
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        Soultion1 soultion1 = new Soultion1();
        String s = "pPoooyY";
        soultion1.solution(s);
    }
}
