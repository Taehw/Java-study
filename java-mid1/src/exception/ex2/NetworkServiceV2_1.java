package exception.ex2;

public class NetworkServiceV2_1 {

//NetworkClient 를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkClientV2 clientV2 = new NetworkClientV2(address);
        clientV2.initError(data); //추가된 코드

        clientV2.connect();
        clientV2.send(data);
        clientV2.disconnect();
    }
}
