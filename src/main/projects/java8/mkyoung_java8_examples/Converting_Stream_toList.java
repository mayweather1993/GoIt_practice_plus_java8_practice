package mkyoung_java8_examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Converting_Stream_toList {
    public static void main(String[] args) {
        Stream<String> language = Stream.of("java" , "python" , "node");
        //List<String> result = language.collect(Collectors.toList());

        //System.out.println(result);
        //result.forEach(System.out::println);


        List<String> result2 = language.filter(x -> !x.equals("java")).collect(Collectors.toList());
        result2.forEach(System.out::println);
    }
}
