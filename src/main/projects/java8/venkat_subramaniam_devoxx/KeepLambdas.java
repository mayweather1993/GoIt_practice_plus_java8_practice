package venkat_subramaniam_devoxx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class KeepLambdas {
    public static void main(String[] args) {
        int[] factor = new int[] {2};

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> doubled =
                numbers.stream()
                        .map(e -> e * factor[0]);

        if(Math.random() > 0.5) factor[0] = 0;

        //What's the output?
        System.out.println(doubled.collect(toList()));
    }
}
