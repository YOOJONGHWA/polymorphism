package test3.interfaceTest;

public class Circle implements Shape{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // 면적 계산
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;  // 원의 면적 공식: π * r^2
    }

    // 둘레 계산
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;  // 원의 둘레 공식: 2 * π * r
    }
}
