package mkyoung_java8_examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOJAVA8 {
    public static void main(String[] args) {
        String filepath = "C:\\text\\text.txt";

        try (Stream<String> stringStream = Files.lines(Paths.get(filepath))) {
            stringStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
