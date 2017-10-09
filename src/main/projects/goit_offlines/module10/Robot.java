package module10;

public class Robot implements CanBeFunWith {
    @Override
    public void tellAJoke() {
        System.out.println("Robot tells stupid jokes");
    }

    @Override
    public void drink(int litres) {
        System.out.println("Robot drinks an oil " + litres);
    }
    @Override
    public void feed(){
        System.out.println("Robot eating badly");
}

}
