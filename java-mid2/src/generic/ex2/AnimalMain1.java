package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0); //동물 하나
        Cat cat = new Cat("냐옹이", 50); // 고양이 하나
        Dog dog = new Dog("멍멍멍", 100); // 개하나

        Box<Dog> dogBox = new Box<>(); //Dog 상자 - 개인스턴스를 받을 수 있음 타입이 Dog 니까
        dogBox.setValue(dog); //Dog 타입의 참조형 dog를 dogBox의 value로 세팅
        Dog findDog = dogBox.getValue(); //Dog 타입의 변수를 선언한위 dog 상자안의 value값으로 초기화(이때 dog 참조변수의 값이 들어서 위에서 생성한 인스턴스들의 멤버 변수에 접근
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        Cat findCat = catBox.getValue();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal); //이때 animal 객체는 cat과 dog의 부모이므로 cat과 dog를 타입 인자로 전달 가능함
        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal = " + findAnimal);
    }
}
