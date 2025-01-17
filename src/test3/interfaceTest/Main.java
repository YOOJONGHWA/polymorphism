package test3.interfaceTest;

public class Main {

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
