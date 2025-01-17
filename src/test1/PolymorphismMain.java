package test1;

public class PolymorphismMain {

    /*
    *   교통수단 관리 시스템 연습 문제
    *   시나리오
    *   모든 교통수단은 공통적으로 이동(move) 기능을 가지고 있습니다.
    *   이를 인터페이스로 정의하여 각 교통수단이 이 기능을 구현하도록 만드세요.
    *   육상 교통수단과 항공 교통수단은 공통적으로 **속도(speed)**와 **수송 인원(capacity)**이라는 속성을 공유합니다.
    *   이를 추상 클래스로 정의하여 공통 속성을 관리하고, 공통 메서드를 제공합니다.
    *   각각의 구체적인 교통수단(예: test1.Car, test1.Airplane)을 만들어 이동 방식을 구현하고, 고유한 동작을 추가하세요.
    *
    *   요구사항
    *   인터페이스 정의:
    *   TransportBehavior라는 인터페이스를 작성합니다.
    *   인터페이스에는 move() 메서드를 선언합니다.
    *
    *   추상 클래스 정의:
    *   Transport라는 추상 클래스를 작성합니다.
    *   공통 속성: speed(int), capacity(int)를 포함합니다.
    *   공통 메서드: displayDetails() 메서드를 구현하여 속도와 수송 인원을 출력합니다.
    *   추상 메서드: move() 메서드를 선언하여 하위 클래스에서 구현하도록 만듭니다.
    *
    *   구체 클래스 작성:
    *   test1.Car 클래스:
    *   Transport를 상속받아 move()를 구현합니다.
    *   고유 메서드: playRadio()를 작성합니다.
    *   test1.Airplane 클래스:
    *   Transport를 상속받아 move()를 구현합니다.
    *   고유 메서드: fly()를 작성합니다.
    *
    *   메인 실행:
    *   Main 클래스에서 다양한 교통수단 객체를 생성합니다.
    *   각각의 교통수단의 displayDetails()와 move() 메서드를 호출하여 정보를 출력합니다.
    *   고유 동작(playRadio(), fly())도 호출하여 동작을 확인합니다.
    *
    *   예시 출력
    *   test1.Car 객체:
    *   test1.Car Details: Speed: 120 km/h, Capacity: 5 passengers.
    *   test1.Car is moving on the road.
    *   test1.Car is playing the radio.
    *
    *   test1.Airplane 객체:
    *   test1.Airplane Details: Speed: 800 km/h, Capacity: 150 passengers.
    *   test1.Airplane is flying in the sky.
    *   test1.Airplane is preparing for landing.
    *
    * */

    public static void main(String[] args) {

        Car car = new Car();
        car.setDetails(120, 5);
        car.displayDetails();
        car.move();
        car.playRadio();

        Airplane airplane = new Airplane();
        airplane.setDetails(800, 150);
        airplane.displayDetails();
        airplane.move();
        airplane.fly();
    }

}
