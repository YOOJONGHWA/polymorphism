package test2;

// Dog: makeSound()는 "멍멍", feed()는 "강아지에게 사료를 줍니다."
public class Dog extends Animal{

    @Override
    protected String AnimaType() {
        return "강아지";
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void feed() {
        System.out.println(AnimaType() + "에게 사료를 줍니다.");
    }
}
