package module8;

public class MyException extends Exception {
    private int count;

    public MyException(String message, int count) {
        super(message + count);
        this.count = count;
    }


    public MyException(String message) {
        super(message);
    }


    public int getCount() {
        return count;
    }

    @Override
    public int hashCode(){
        return 2;
    }
}
