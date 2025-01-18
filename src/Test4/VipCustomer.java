package Test4;

public class VipCustomer extends Customer {

    public VipCustomer(String name, String grade, int price, double discountRate) {
        super(name, grade, price, discountRate);
    }

    @Override
    protected double getBuyPrice() {
        return paid();
    }

    @Override
    public double paid() {
        return price * (1 - discountRate);
    }
}
