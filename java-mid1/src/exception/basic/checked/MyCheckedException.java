package exception.basic.checked;

public class MyCheckedException extends  Exception{ //예외 클래스 만들려면 예외를 상속부터 받아야함

    //Alt + insert로 생성 -> exception message
/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */

    public MyCheckedException(String message) {
        super(message); //Exception에 가면 오류메시지 보관소 있음 부모가 제공해줘서 펴함
    }
}
