package venkat_subramaniam_devoxx;

import java.util.stream.IntStream;

public class UsingRange {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        IntStream.range(0, 10)
                .forEach(System.out::println);
    }
}


