package exception.ex1;

public class NetworkServiceV1_1 {
//NetworkClient 를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 clientV1 = new NetworkClientV1(address);

        clientV1.initError(data); //추가된 코드

        clientV1.connect();
        clientV1.send(data);
        clientV1.disconnect();
    }
}
