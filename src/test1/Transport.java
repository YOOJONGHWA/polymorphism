package test1;

public abstract class Transport implements TransportBehavior{

    int speed;
    int capacity;

    public void setDetails(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public void displayDetails() {
        System.out.println(getType() + " Details: Speed: " + speed + " km/h, Capacity: " + capacity + " passengers.");
    }

    protected abstract String getType();

}
