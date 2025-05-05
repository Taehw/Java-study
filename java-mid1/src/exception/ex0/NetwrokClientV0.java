package exception.ex0;

//Client - 외부서버와 연결하고 데이터를 전송 , 기능들을 제어

public class NetwrokClientV0 {

    private final String address; //접속할 외부 서버 주소

    public NetwrokClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void diconnect() {
        //연결 해제
        System.out.println(address + " 서버 연결 해제");
    }
}
