package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3{

    private final String address; //어느 서버의 연결을 실패했는지 넣어줌

    public ConnectExceptionV3(String address, String message) { //ctrl + alt + shift 로 쉽게 변경
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
