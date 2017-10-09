package module1;

import java.math.BigDecimal;

public class Task1 {
    public static void main(String[] args) {
        String[] products = {"Butt", "Milk", "Meat"};
        BigDecimal[] price = new BigDecimal[3];
        price[0] = new BigDecimal(8.5);
        price[1] = new BigDecimal(3.5);
        price[2] = new BigDecimal(4.5);
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + price[i].doubleValue());
            sum = sum.add(price[i]);
        }

        BigDecimal average = sum.divide(new BigDecimal(products.length) , 2 , BigDecimal.ROUND_HALF_DOWN);

        System.out.println("average : " + average);
    }
}
