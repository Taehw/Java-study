package exception.basic.checked;

public class Service {

    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */

    public void callCatch() {

        try {
            client.call();
            // 터진 폭탄이 날아오는곳, 예외로 가자마자 예외가 터지고 그뒤에 코드 실행없이 호출한곳으로 돌아옴
            // clinet.call();이 throw new MyCheckedException("ex"); 로 변환다고 생각(예외가 날라온거임)
            // -> 폭탄은 잡아야지
        } catch (MyCheckedException e) {
            //예외 처리 로직
            //폭탄 처리
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다.
     */

    public void catchThrow() throws MyCheckedException { //예외처리 못하면 던짐 밖으로
        client.call();
    }
}
