package exception.ex4.exception;

public class NetworkClientExceptionV4 extends RuntimeException{ // 런타임으로 벼경

    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
