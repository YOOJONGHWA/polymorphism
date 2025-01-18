package test3.both;

public class Main {

    /*
    *
    * 문제 3: 추상 클래스와 인터페이스의 조합
    * 추상 클래스 Vehicle과 인터페이스 Drivable를 작성하고, 이를 구현하는 Car와 Bike 클래스를 작성하세요.
    * 요구 사항:
    * 추상 클래스 Vehicle 작성:
    * 멤버 변수: name(이름).
    * 생성자: 이름을 초기화.
    * abstract 메서드: void start() (출발).
    * 인터페이스 Drivable 작성:
    * 메서드: void drive() (운전).
    * Car 클래스 작성:
    * Vehicle을 상속받고, Drivable를 구현.
    * start: "Car is starting..." 출력.
    * drive: "Car is driving..." 출력.
    * Bike 클래스 작성:
    * Vehicle을 상속받고, Drivable를 구현.
    * start: "Bike is starting..." 출력.
    * drive: "Bike is driving..." 출력.
    * 메인 메서드에서 Vehicle 배열에 Car와 Bike 객체를 저장하고, 각 객체의 start와 drive를 호출하세요.
    *
    * */

    public static void main(String[] args) {

        Vehicle[] vehicles = {new Car("Car"), new Bike("Bike")};

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            if (vehicle instanceof Drivable) {
                ((Drivable) vehicle).drive();
            }
        }

    }

}
