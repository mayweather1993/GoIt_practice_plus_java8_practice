package module7.cars;

import java.io.Serializable;

public class Car implements Serializable{
    static final long serialVersionUID = 3L;
    String name;
    String color;
    int year;
    int some;
    Engine engine;

    public Car() {
    }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", some=" + some +
                ", engine=" + engine +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSome() {
        return some;
    }

    public void setSome(int some) {
        this.some = some;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }
}
