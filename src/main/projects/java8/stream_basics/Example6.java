package stream_basics;

import java.util.stream.IntStream;

public class Example6{
    public static void main(String[] args) {
        IntStream.range(1 , 4)
                .mapToObj(i -> "c" + i)
                .forEach(System.out::println);
    }
}
