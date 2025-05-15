package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {

        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);

//        writeBox(dogBox); //하한이 Animal Animal 이상은 전달해주세요 ;;
//        writeBox(catBox);

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    private static void writeBox(Box<? super Animal> box) { //?가 Animal 보단 높아야함 -> 와일드카드로 Object랑 Animal만 받을수 잇음
        box.set(new Dog("멍멍이", 100));
    }
}