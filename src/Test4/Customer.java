package Test4;

public abstract class Customer implements discount {

    String name;
    String grade;
    int price;
    double discountRate;

    public Customer(String name, String grade, int price, double discountRate) {
        this.name = name;
        this.grade = grade;
        this.price = price;
        this.discountRate = discountRate;
    }

    protected void displayInfo() {
        System.out.println("이름: " + name + ", 등급: " + grade + ", 할인율: " + discountRate +
                ", 구매 가격: " + getBuyPrice());
    }

    protected abstract double getBuyPrice();
}
