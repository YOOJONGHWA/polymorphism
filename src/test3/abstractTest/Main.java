package test3.abstractTest;

public class Main {

    /*
    * 문제 1: 추상 클래스 활용
    * 추상 클래스 Employee를 작성하세요.
    * 멤버 변수: name(이름), baseSalary(기본급).
    * 생성자: 이름과 기본급을 초기화합니다.
    * abstract 메서드: calculateSalary() (급여 계산 메서드).
    * 일반 메서드: 직원 정보를 출력하는 printInfo() 메서드.
    * Employee를 상속받는 FullTimeEmployee와 PartTimeEmployee 클래스를 작성하세요.
    * FullTimeEmployee: 기본급의 100%를 급여로 계산.
    * PartTimeEmployee: 기본급의 50%를 급여로 계산.
    * 메인 메서드에서 두 직원의 이름과 급여를 출력하세요.
    *
    *
    * */

    public static void main(String[] args) {

        Employee  fullTimeEmployee = new FullTimeEmployee("홍길동", 1000000);
        fullTimeEmployee.printInfo();

        Employee  partTimeEmployee = new PartTimeEmployee("김철수", 1000000);
        partTimeEmployee.printInfo();

    }

}
