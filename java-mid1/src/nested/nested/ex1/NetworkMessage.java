package nested.nested.ex1;

//Network 객체안에서만 사용 -> 굳이 두 클래스를 분리할필요 있을까?
public class NetworkMessage { //그냥 메시를 받아서 출력만 하는 기능

    private String message;

    public NetworkMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(message);
    }
}
