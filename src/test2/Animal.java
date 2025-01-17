package test2;

public abstract class Animal implements AnimalBehavior{

    String name;
    int age;

    public void setAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println(AnimaType() + " 의 이름:" + name + "나이는: " + age);
    }

    protected abstract String AnimaType();
}
