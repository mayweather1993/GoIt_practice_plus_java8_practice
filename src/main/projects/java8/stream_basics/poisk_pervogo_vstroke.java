package stream_basics;

import java.util.Arrays;

public class poisk_pervogo_vstroke {
    public static void main(String[] args) {
        Arrays.asList("cc1", "cc2", "cc3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
