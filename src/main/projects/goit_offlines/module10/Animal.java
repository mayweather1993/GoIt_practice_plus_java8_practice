package module10;

public class Animal implements CanBeFeeded {

    @Override
    public void feed() {
        System.out.println("I am animal and i am eating the food");
    }
}
