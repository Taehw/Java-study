package exception.ex1;

//Client - 외부서버와 연결하고 데이터를 전송 , 기능들을 제어

public class NetworkClientV1 {

    private final String address; //접속할 외부 서버 주소
    public boolean connectError; //실패정보를 전달할수 있도록 boolena타입의 필드 선언
    public boolean sendError; //디폴트는 false

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) { //error가 발생하면 false 에서 true 가 되면서 오류 메세지 실행 - initError( ) 메서드 추가
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버 연결 실패");
            return "sendError";
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        //연결 해제
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) { //connectError , sendError 필드의 값을 true 로 설정할 수 있다.
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
