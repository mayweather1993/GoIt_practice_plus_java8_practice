package stream_basics;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream.of("cc1" , "cc2" , "cc3")
                .findFirst()
                .ifPresent(System.out::println);
    }
}
