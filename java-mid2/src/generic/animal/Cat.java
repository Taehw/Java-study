package generic.animal;

public class Cat extends Animal{

    public Cat(String name, int size) {
        super(name, size); //부모클래스의 생성자를 호출
    }

    @Override
    public void sound() {
        System.out.println("냥냥");
    }
}
