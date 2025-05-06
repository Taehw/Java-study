package exception.ex4.exception;

public class ConnectExceptionV4 extends NetworkClientExceptionV4{

    private final String address; //어느 서버의 연결을 실패했는지 넣어줌

    public ConnectExceptionV4(String address, String message) { //ctrl + alt + shift 로 쉽게 변경
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
