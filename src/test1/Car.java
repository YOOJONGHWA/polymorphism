package test1;

public class Car extends Transport{

    @Override
    public void move() {
        System.out.println("test1.Car is moving on the road.");
    }

    public void playRadio() {
        System.out.println("test1.Car is playing radio");
    }

    @Override
    protected String getType() {
        return "test1.Car";
    }
}
