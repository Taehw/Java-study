package exception.ex2;

public class NetworkServiceV2_2 {

//NetworkClient 를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 clientV2 = new NetworkClientV2(address);
        clientV2.initError(data); //추가된 코드

        try {
            clientV2.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return; //연결이 안됐는데 send하는걸 막기위해 return문 추가
        }

        try {
            clientV2.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }
        clientV2.disconnect();
    }
}
