package stream_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Foo {
    String name;
    List<Bar> bars = new ArrayList<>();

    public Foo(String name) {
        this.name = name;
    }
}

class Bar {
    String name;

    public Bar(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        List<Foo> foos = new ArrayList<>();
        // creating foos
        IntStream.range(1, 4)
                .forEach(i -> foos.add(new Foo("Foo" + i)));


        //creating bars
        foos.forEach(foo -> IntStream.range(1, 4)
                .forEach(i -> foo.bars.add(new Bar("Bar" + i + " <- " + foo.name))));

        foos.stream().flatMap(foo -> foo.bars.stream())
                .forEach(bar -> System.out.println(bar.name));
    }
}
