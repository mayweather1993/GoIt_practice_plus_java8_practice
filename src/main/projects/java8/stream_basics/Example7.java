package stream_basics;

import java.util.stream.Stream;

public class Example7{
    public static void main(String[] args) {
        Stream.of("dd2" , "aa2" , "bb1" , "bb3", "cc3")
                .map(s -> {
                    System.out.println("map : " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter : " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach : " + s));
    }
}
