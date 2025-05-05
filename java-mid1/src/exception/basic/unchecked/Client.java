package exception.basic.unchecked;

public class Client {

    public void call() {
        throw new MyUncheckedException("ex"); //throws를 하지 않아도 오류가 없음, 폭탄터지면 알아서 나감 어휴 착해~
    }
}
