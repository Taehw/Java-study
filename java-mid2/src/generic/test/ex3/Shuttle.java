package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    //Shuttle 클래스의 조건
    //1. 제네릭 타입을 사용
    //2. showInfo()메서드를 통해 탑승한 유닛의 정보를 출력

    private T unit;

    public void in(T t1) {
        unit = t1;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
