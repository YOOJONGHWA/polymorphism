package test3.interfaceTest;

public class Main {

    /*
    * 문제 2: 인터페이스 활용
    * 인터페이스 Shape를 작성하고 이를 구현하는 Circle과 Rectangle 클래스를 작성하세요.
    * 각 클래스는 면적과 둘레를 계산하는 메서드를 구현해야 합니다.
    *
    * 요구 사항:
    * 인터페이스 Shape 작성:
    * 메서드: double calculateArea() (면적 계산), double calculatePerimeter() (둘레 계산).
    * Circle 클래스 작성:
    * 멤버 변수: radius(반지름).
    * 생성자: 반지름을 초기화.
    * calculateArea: 원의 면적 계산.
    * calculatePerimeter: 원의 둘레 계산.
    * Rectangle 클래스 작성:
    * 멤버 변수: width(가로), height(세로).
    * 생성자: 가로와 세로를 초기화.
    * calculateArea: 직사각형의 면적 계산.
    * calculatePerimeter: 직사각형의 둘레 계산.
    * 메인 메서드에서 각 도형의 면적과 둘레를 출력하세요.
    *
    * */

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // 원의 면적과 둘레 출력
        System.out.println("원 면적: " + circle.calculateArea());
        System.out.println("원 둘레: " + circle.calculatePerimeter());

        // 직사각형의 면적과 둘레 출력
        System.out.println("직사각형 면적: " + rectangle.calculateArea());
        System.out.println("직사각형 둘레: " + rectangle.calculatePerimeter());
    }
}
