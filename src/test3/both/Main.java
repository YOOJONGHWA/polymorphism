package test3.both;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {new Car("Car"), new Bike("Bike")};

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            if (vehicle instanceof Drivable) {
                ((Drivable) vehicle).drive();
            }
        }

    }

}
