package mkyoung_java8_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExamples {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("spring" , "node" , "mkyoung");


        List<String> result = stringList.stream()
                .filter(line -> !"mkyoung".equals(line))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
