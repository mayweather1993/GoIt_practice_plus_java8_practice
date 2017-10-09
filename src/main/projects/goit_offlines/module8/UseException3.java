package module8;

public class UseException3 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    private static int f() {
        try {
            g();
        } catch (MyException e) {
            System.out.println("I caught " + e.getMessage());
            f();
            return 3;
        } finally {
            System.out.println("Finally");
            return 5;
        }
    }

    private static void g() throws MyException {
        throw new MyException("My ex", 1);
    }
}
