package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    //일반적인 제네릭 메서드
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    //와일드카드를 사용한 일반 메서드 + 반환타입이 없다
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    //상한을 Animal로 정한 제네릭메서드 호출시 타입이 결정된다
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    //Animal 타입만 받을수 있는 와일드카드
    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get(); //바로 Animal 변수에 넣을수 있음
        System.out.println("이름 = " + animal.getName());
    }


    //뭔진 모르지만 T 타입을 반환하는 제네릭 메서드
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    //Animal 타입을 반환하는 Wildcard 를 사용하는 일반 메서드
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

}
