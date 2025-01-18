package Test4;

public class NormalCustomer extends Customer {

    public NormalCustomer(String name, String grade, int price, double discountRate) {
        super(name, grade,price,discountRate);
    }

    @Override
    protected double getBuyPrice() {
        return (int) paid();
    }

    @Override
    public double paid() {
        return price * (1 - discountRate);
    }
}
