package poly.car1;

public class Driver {

    private Car car; //null로 초기화, 아직 자동차를 가지고 있지 않는 경우임 setCar를 통해서 넣어줘야함

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccerlerator();
        car.offEngine();
    }
}
