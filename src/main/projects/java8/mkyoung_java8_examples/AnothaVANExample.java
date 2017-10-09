package mkyoung_java8_examples;

import java.util.Arrays;
import java.util.List;

public class AnothaVANExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("mkyoung" , 30),
                new Person("jack" , 20),
                new Person("lawrence" , 40)

        );


        Person result1 = personList.stream()
                .filter(x -> "jack".equals(x.getName()))
                .findAny()
                .orElse(null);
        System.out.println(result1);


        Person result2 = personList.stream()
                .filter(x -> "ahmock".equals(x.getName()))
                .findAny()
                .orElse(new Person("pashka" , 24));

        System.out.println(result2);
    }
}
