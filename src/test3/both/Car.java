package test3.both;

public class Car extends Vehicle implements Drivable{

    public Car(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }

    @Override
    protected void start() {
        System.out.println("Car is starting...");
    }
}
