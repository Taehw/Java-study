package static2.ex;

public class Car {

    private static int count;
    public String name;

    public Car(String carName) {
        System.out.println("차량 구입" + ", 이름: " + carName);
        this.name = name;
        count++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }
}
