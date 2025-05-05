package exception.ex0;

public class NetworkServiceV0 {
//NetworkClient 를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetwrokClientV0 clientV0 = new NetwrokClientV0(address);

        clientV0.connect();
        clientV0.send(data);
        clientV0.diconnect();
    }
}
