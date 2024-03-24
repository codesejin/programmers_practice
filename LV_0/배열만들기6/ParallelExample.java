package LV_0.배열만들기6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "홍길동", "신용권", "김자바",
                "람다식", "박병렬");

        // 순차 처리
        Stream<String> stream = list.stream();
                        // 메소드 참조(s -> ParallelExampleprint(s)와 동일)
        stream.forEach(ParallelExample :: print);
        System.out.println();

        // 병렬 처리
        Stream<String> parallelStream = list.parallelStream();
                                // 메서드 참조
        parallelStream.forEach(ParallelExample::print);

    }

    public static void print(String str) {
        System.out.println(str+ " : " + Thread.currentThread().getName());
    }
}
