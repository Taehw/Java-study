package poly.car1;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }
    @Override
    public void offEngine() {
        System.out.println("NewCar.endEngine");
    }
    @Override
    public void pressAccerlerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}
