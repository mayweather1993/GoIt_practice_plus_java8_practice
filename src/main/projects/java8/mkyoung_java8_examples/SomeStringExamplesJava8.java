package mkyoung_java8_examples;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class SomeStringExamplesJava8 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        String resukt = sj.toString();
        System.out.println(resukt);



        StringJoiner stringJoiner = new StringJoiner("/" , "prefix-" , "-suffix");
        stringJoiner.add("2016");
        stringJoiner.add("02");
        stringJoiner.add("26");
        String result = stringJoiner.toString();
        System.out.println(result);


        String kek = String.join("+" , "2015" , "1993" , "200");
        System.out.println(kek);




        List<String> list = Arrays.asList("java" , "python" , "nodejs" , "ruby");
        String string = list.stream()
                .collect(Collectors.joining("|"));
        System.out.println(string);



    }
}
