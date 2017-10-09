package stream_basics;

import java.util.stream.Stream;

public class Example9{
    public static void main(String[] args) {
        Stream.of("dd2" , "aa2" , "bb1" , "bb3" , "cc4")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .sorted((s1, s2) ->{
                    System.out.printf("sort: %s; %s/n" , s1 , s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map : " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("for each :" + s));
    }
}
