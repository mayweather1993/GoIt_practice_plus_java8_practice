package mkyoung_java8_examples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

        Map<String, Long> counting = items.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println(counting);

        Map<String, Integer> sum = items.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQuantity)));
        System.out.println(sum);


        Map<BigDecimal, List<Item>> groupingByPriceMap =
                items.stream().collect(Collectors.groupingBy(Item::getPrice));
        System.out.println(groupingByPriceMap);

        Map<BigDecimal, Set<String>> result =
                items.stream().collect(Collectors.groupingBy(Item :: getPrice , Collectors.mapping(Item :: getName , Collectors.toSet())));
        System.out.println(result);

    }


}
