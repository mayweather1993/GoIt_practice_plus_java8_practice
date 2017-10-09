package stream_basics;

import java.util.stream.IntStream;

public class Example3 {
    public static void main(String[] args) {
        IntStream.range(1, 1000)
                .forEach(System.out::println);
    }
}
