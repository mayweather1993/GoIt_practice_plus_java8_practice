package stream_basics;

import java.util.stream.Stream;

public class Example10{
    public static void main(String[] args) {
        Stream<String> stream =
                Stream.of("dd2", "aa2", "bb1", "bb3", "cc")
                        .filter(s -> s.startsWith("a"));
        // cant do double stream
        stream.anyMatch(s -> true);
        stream.noneMatch(s -> true);
    }

}
