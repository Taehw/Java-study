package lang.object.poly;

public class ObjectPolyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        obj.sound(); //컴파일 오류, Object는 sound가 없다.
//        obj.move(); //컴파일 오류, Object는 move가 없다.
        if (obj instanceof Dog dog) { //instance 를 검사하는 동시에 다운캐스팅(선언까지 동시에)
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }

    }
}
