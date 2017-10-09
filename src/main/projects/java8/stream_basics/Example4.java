package stream_basics;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        //1 * 2 + 1
        Arrays.stream(new int[] {1 ,2 , 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);
    }
}


