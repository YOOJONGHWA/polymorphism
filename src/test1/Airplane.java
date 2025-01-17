package test1;

public class Airplane extends Transport{


    @Override
    public void move() {
        System.out.println("test1.Airplane is flying in the sky.");
    }

    public void fly() {
        System.out.println("test1.Airplane is preparing for landing.");
    }

    @Override
    protected String getType() {
        return "test1.Airplane";
    }
}
