package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    //동물병원의 주요기능 두개를 제네릭 타입이 아닌 제네릭 메서드로 리팩토깅

    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1, T t2) { //비교대상 외부에서 받아와야함 이렇게 같이 T로 하면 개는 개끼리 고양이는 고양이끼리 비교되겠다.
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
