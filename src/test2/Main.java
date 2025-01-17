package test2;

public class Main {

    /*
    * 문제: 동물 보호소 시스템
    * 시나리오
    * 동물 보호소에서 여러 종류의 동물을 관리하는 시스템을 구현하세요. 모든 동물은 이름, 나이, 소리 내기 기능을 가지고 있습니다.
    * 각 동물마다 고유한 소리를 낼 수 있도록 합니다. 또한 동물들은 먹이 주기 기능을 가집니다.
    *
    * 요구사항
    * 인터페이스 AnimalBehavior를 정의합니다.
    * makeSound() 메서드: 동물이 소리를 낸다.
    * feed() 메서드: 동물에게 먹이를 준다.
    *
    * 추상 클래스 Animal을 정의합니다.
    * name, age라는 공통 속성을 가집니다.
    * displayDetails() 메서드: 동물의 이름과 나이를 출력합니다.
    *
    * 구체 클래스:
    * Dog: makeSound()는 "멍멍", feed()는 "강아지에게 사료를 줍니다."
    * Cat: makeSound()는 "야옹", feed()는 "고양이에게 사료를 줍니다."
    * Bird: makeSound()는 "짹짹", feed()는 "새에게 씨앗을 줍니다."
    *
    * 메인 실행:
    * 여러 동물 객체를 생성하고, 각 동물의 정보를 출력합니다.
    * 각 동물의 makeSound()와 feed() 메서드를 호출하여 다형성을 확인합니다.
    *
    * 목표
    * 다형성을 활용하여 동물 객체들이 동일한 메서드를 호출하더라도 다르게 동작하도록 만듭니다.
    * 상속을 사용하여 공통적인 속성과 메서드를 재사용합니다.
    * 인터페이스와 추상 클래스를 결합하여 객체지향 설계를 실습합니다.
    *
    *
    * */

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setAnimal("강아지" , 10);
        dog.displayDetails();
        dog.makeSound();
        dog.feed();

        Cat cat = new Cat();
        cat.setAnimal("고양이", 2);
        cat.displayDetails();
        cat.makeSound();
        cat.feed();

        Bird bird = new Bird();
        bird.setAnimal("새", 20);
        bird.displayDetails();
        bird.makeSound();
        bird.feed();

    }

}
