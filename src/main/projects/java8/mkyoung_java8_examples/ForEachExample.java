package mkyoung_java8_examples;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("A" , "B" , "C" , "D" , "F");

        items.forEach(System.out::println);

        items.forEach(item -> {
            if("C".equals(item)){
                System.out.println(item);
            }
        });


        items.stream()
                .filter(s -> s.contains("B"))
                .forEach(System.out::println);

    }
}
