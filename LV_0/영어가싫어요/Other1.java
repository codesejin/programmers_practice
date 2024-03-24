package LV_0.영어가싫어요;

public class Other1 {
    public long solution(String numbers) {
        return Long.parseLong(
                numbers.replace("zero", "0")
                        .replace("one", "1")
                        .replace("two", "2")
                        .replace("three", "3")
                        .replace("four", "4")
                        .replace("five", "5")
                        .replace("six", "6")
                        .replace("seven", "7")
                        .replace("eight", "8")
                        .replace("nine", "9")
        );
    }
}
