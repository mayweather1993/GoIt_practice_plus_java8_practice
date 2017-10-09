package module8;

public class UseException2 {
    public static void main(String[] args) {
        Object someObj = new MyException("");
        if(someObj != null){
            System.out.println(someObj.hashCode());
        }
        else {
            someObj = new Object();
            System.out.println(someObj.hashCode());
        }
        System.out.println("I want to see this");
    }
}
