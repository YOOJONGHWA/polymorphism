package test3.abstractTest;

public class Main {

    public static void main(String[] args) {

        Employee  fullTimeEmployee = new FullTimeEmployee("홍길동", 1000000);
        fullTimeEmployee.printInfo();

        Employee  partTimeEmployee = new PartTimeEmployee("김철수", 1000000);
        partTimeEmployee.printInfo();

    }

}
