package test3.both;

public class Bike extends Vehicle implements Drivable{

    public Bike(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Bike is driving...");
    }

    @Override
    protected void start() {
        System.out.println("Bike is starting...");
    }
}
