package mkyoung_java8_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentExampleFlatMap {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setName("mkyoung");
        obj1.addBook("JAva in action");
        obj1.addBook("Spring boot in action");
        obj1.addBook("Effective java");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning feels bad man");
        obj2.addBook("Effective java");


        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        List<String> collect = list.stream()
                .map(x -> x.getBook())
                .flatMap(x -> x.stream())
                .distinct()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

    }
}
