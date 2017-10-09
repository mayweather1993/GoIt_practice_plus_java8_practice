package stream_basics;

import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> mList = Arrays.asList("aa1" , "bb2" , "aa3" , "aa0" , "c99");
        mList
                .stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
