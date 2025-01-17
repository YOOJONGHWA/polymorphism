package test3.abstractTest;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public double calculateSalary() {
        return salary;
    }

}
