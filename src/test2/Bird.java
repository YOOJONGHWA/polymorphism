package test2;

//  Bird: makeSound()는 "짹짹", feed()는 "새에게 씨앗을 줍니다."
public class Bird extends Animal{

    @Override
    protected String AnimaType() {
        return "새";
    }

    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }

    @Override
    public void feed() {
        System.out.println(AnimaType() + "에게 씨앗을 줍니다.");
    }
}
