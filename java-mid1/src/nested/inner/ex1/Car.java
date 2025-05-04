package nested.inner.ex1;

public class Car {

    private String model;
    private int chargelevel;
    private Engine engine;

    public Car(String model, int chargelevel) {
        this.model = model;
        this.chargelevel = chargelevel;
        this.engine = new Engine(this);
    }

    //엔진에서만 사용하는 기능인데 모델이름과 충전레벨을 외부에 노출해야될까?
    public int getChargeLevel() {
        return chargelevel;
    }

    public String getModel() {
        return model;
    }
    /// ///////////////////////////////////////////////////////////////
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
