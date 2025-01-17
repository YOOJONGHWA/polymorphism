package test3.abstractTest;

public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public double calculateSalary() {
        return salary * 0.5;
    }
}
