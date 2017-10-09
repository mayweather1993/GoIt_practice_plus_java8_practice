package stream_basics;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {


        List<Person> persons = Arrays.asList(
                new Person("Andrew", 20),
                new Person("Igor", 23),
                new Person("Ira", 23),
                new Person("Vitya", 12)
        );

        List<Person> filtered = persons
                .stream()
                .filter(s -> s.name.startsWith("I"))
                .collect(Collectors.toList());
        //System.out.println(filtered);


        Map<Integer, List<Person>> personsByAGe = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));
        personsByAGe
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));


        Double averageAge = persons
                .stream()
                .collect(Collectors.averagingInt(p -> p.age));
        //  System.out.println(averageAge);


        IntSummaryStatistics ageSummary = persons
                .stream()
                .collect(Collectors.summarizingInt(p -> p.age));
        // System.out.println(ageSummary);


        String phrase = persons
                .stream()
                .filter(s -> s.age >= 18)
                .map(s -> s.name)
                .collect(Collectors.joining(" и ", "В Германии ", " совершеннолетние."));
        //   System.out.println(phrase);

        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "),          // supplier
                        (j, p) -> j.add(p.name.toUpperCase()),  // accumulator
                        StringJoiner::merge,               // combiner
                        StringJoiner::toString);                // finisher

        String names = persons
                .stream()
                .collect(personNameCollector);

        //    System.out.println(names);


        //REDUCE
        //binaryOperator
        persons
                .stream()
                .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
                .ifPresent(System.out::println);

//REDUCE
        Person result =
                persons
                        .stream()
                        .reduce(new Person("", 0), (p1, p2) -> {
                            p1.age += p2.age;
                            p1.name += p2.name;
                            return p1;
                        });
       // System.out.printf("name=%s ; age=%s", result.name, result.age);




        //REDUCE (summa agov)

        Integer ageSum = persons
                .stream()
                .reduce(0 , (sum , p) -> sum +=p.age ,(sum1 , sum2) -> sum1 + sum2);
        System.out.println(ageSum);
    }
}

