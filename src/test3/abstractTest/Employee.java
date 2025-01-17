package test3.abstractTest;

public abstract class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    public void printInfo() {
        System.out.println(name + "의 급여는 " + calculateSalary() + "원 입니다.");
    }
}
