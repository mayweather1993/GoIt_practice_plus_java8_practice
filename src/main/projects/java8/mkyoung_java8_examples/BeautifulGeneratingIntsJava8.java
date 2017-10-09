package mkyoung_java8_examples;

import java.util.Random;

public class BeautifulGeneratingIntsJava8 {
    public static void main(String[] args) {
        new Random().ints(17 , 0 , 38).forEach(System.out::println);
    }
}
