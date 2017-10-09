package module8;

import java.io.IOException;

public class UseException4 {
    public static void main(String[] args) {
        try {
            doSomeAction(args[0]);
        } catch (RuntimeException | MyException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void doSomeAction(String arg) throws MyException, IOException {
        switch (arg) {
            case "1":
                throw new IOException(arg);
            case "2":
                throw new MyException(arg);
            case "3":
                throw new ArithmeticException();
        }
    }
}
