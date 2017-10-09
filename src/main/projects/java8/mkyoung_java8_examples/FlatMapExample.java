package mkyoung_java8_examples;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};


        Stream<String[]> temp = Arrays.stream(data);

        Stream<String> stringStream = temp.flatMap(Arrays::stream);

        Stream<String> stream = stringStream.filter("a"::equals);
        stream.forEach(System.out::println);


        int [] array = {1 ,2 ,3 ,4 ,5 ,6};

        Stream<int []> streamArray = Stream.of(array);
        IntStream intStream = streamArray.flatMapToInt(Arrays::stream);

        intStream.forEach(System.out::println);
    }
}
