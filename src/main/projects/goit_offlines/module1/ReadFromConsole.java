package module1;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer integer = 0;
        String line = "";
        while ((scanner.hasNextLine())) {
            if (scanner.hasNextInt()) {
                integer = scanner.nextInt();
                line = "" + integer;
            } else {
                line = scanner.nextLine();
            }
            System.err.println("You entered : " + line);
            System.err.println("*10 : " + 10 * integer);
        }
        scanner.close();
    }

}
