package test2;

// Cat: makeSound()는 "야옹", feed()는 "고양이에게 사료를 줍니다."
public class Cat extends Animal {

    @Override
    protected String AnimaType() {
        return "고양이";
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public void feed() {
        System.out.println(AnimaType() + "에게 사료를 줍니다.");
    }
}
