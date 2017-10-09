package module1;

public class Table {
    String color = "white";
    static int sumDistance = 0;

    public void rollTheTable(int distance){
        sumDistance += distance;
        System.out.println("table replaced : " + distance);
        System.out.println("sum distance : " + sumDistance);
    }
}
