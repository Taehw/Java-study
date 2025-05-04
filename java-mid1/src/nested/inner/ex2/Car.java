package nested.inner.ex2;

public class Car {

    private String model;
    private int chargelevel;
    private Engine engine;

    public Car(String model, int chargelevel) {
        this.model = model;
        this.chargelevel = chargelevel;
        this.engine = new Engine();
    }

    //엔진에서만 사용하는 기능인데 모델이름과 충전레벨을 외부에 노출해야될까?
//    public int getChargeLevel() {
//        return chargelevel;
//    }
//
//    public String getModel() {
//        return model;
//    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {

        //private Car car; -> 바깥클래스의 인스턴스에 접근할수 있으니까 필요없음

        public void start() {
            System.out.println("충전 레벨 확인: " + chargelevel); //getter 가 필요없음 그냥 바깥인스턴스 멤버에 바로 접근하면됨
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
