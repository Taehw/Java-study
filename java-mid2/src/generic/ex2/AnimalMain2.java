package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0); //동물 하나
        Cat cat = new Cat("냐옹이", 50); // 고양이 하나
        Dog dog = new Dog("멍멍멍", 100); // 개하나

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal); //이때 animal 객체는 cat과 dog의 부모이므로 cat과 dog를 타입 인자로 전달 가능함
        animalBox.setValue(dog); //이때 animal 객체는 cat과 dog의 부모이므로 cat과 dog를 타입 인자로 전달 가능함
        animalBox.setValue(cat); //이때 animal 객체는 cat과 dog의 부모이므로 cat과 dog를 타입 인자로 전달 가능함
        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal = " + findAnimal); //Animal 타입의 참조값의 toString은 오버라이딩으로 재정의 하였으면 원하는 형식으로 값 확인
    }
}
