package poly.car1;

public class K3Car implements Car{

    @Override
    public void startEngine() {
        System.out.println("K3.car.startEngine");
    }
    @Override
    public void offEngine() {
        System.out.println("K3.car.endEngine");
    }
    @Override
    public void pressAccerlerator() {
        System.out.println("K3Car.pressAccelerator");
    }
}
