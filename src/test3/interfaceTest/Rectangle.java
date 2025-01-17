package test3.interfaceTest;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 면적 계산
    @Override
    public double calculateArea() {
        return width * height;  // 직사각형의 면적 공식: 가로 * 세로
    }

    // 둘레 계산
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);  // 직사각형의 둘레 공식: 2 * (가로 + 세로)
    }

}
