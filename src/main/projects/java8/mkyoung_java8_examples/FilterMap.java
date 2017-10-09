package mkyoung_java8_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMap {
    public static void main(String[] args) {
        Map<Integer , String> hosting = new HashMap<>();


        hosting.put(1 , "linode.com");
        hosting.put(2 , "heroku.com");
        hosting.put(3 , "digitalocean.com");
        hosting.put(4 , "aws.amazon.com");


        String result = "";

        for (Map.Entry<Integer , String> entry :hosting.entrySet()){
            if("linode.com".equals(entry.getValue())){
                result = entry.getValue();
            }
        }
        System.out.println("Before java 8 " + result);




        result = hosting.entrySet().stream()
                .filter(map -> "linode.com".equals(map.getValue()))
                .map(Map.Entry::getValue)
                .collect(Collectors.joining());
        System.out.println(result);



        Map<Integer , String> collect = hosting.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(p -> p.getKey() , p -> p.getValue()));
        System.out.println(collect);
    }
}
