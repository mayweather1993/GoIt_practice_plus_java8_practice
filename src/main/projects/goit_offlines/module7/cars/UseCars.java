package module7.cars;

import java.util.Optional;

public class UseCars {
    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.setName("BMW");
        Car car = new Car(engine);
        System.out.println("Length + " + gerCarNameLength(car));
    }


    private static int gerCarNameLength(Car car){
        String name = Optional.of(car).map(Car::getEngine).map(Engine::getName).orElse("");
        return name.length();
    }
}
