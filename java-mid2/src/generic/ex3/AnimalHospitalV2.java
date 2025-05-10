package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2 <T>{

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        //// T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용 가능

        animal.toString();
        animal.equals(null); //일단 오류 없애기 위해서 아무거나

        ////컴파일 오류
////        System.out.println("동물이름: " + animal.getName());
////       System.out.println("동물사이즈: " + animal.getSize());
////        animal.sound();
    }

    public Animal bigger(Animal target) {

//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
