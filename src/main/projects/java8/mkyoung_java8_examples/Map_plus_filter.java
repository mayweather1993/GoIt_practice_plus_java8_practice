package mkyoung_java8_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_plus_filter {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );


        String name = persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Person::getName)
                .findFirst()
                .orElse("");

        System.out.println("name " + name);

        List<Integer> collect = persons.stream()
                .map(Person :: getAge)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
