package mkyoung_java8_examples;

public class StringtoCharArray {
    public static void main(String[] args) {
        String password = "password1234566";
        char[]passwordinCHarArray = password.toCharArray();

        for (char temp :
                passwordinCHarArray) {
            System.out.println(temp);
        }







        password.chars().mapToObj(x -> (char) x)
                .forEach(System.out::println);
    }
}
