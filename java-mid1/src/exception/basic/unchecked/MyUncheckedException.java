package exception.basic.unchecked;

/**
 * RuntimeException을 상속받은 예외는 언체크 예외가 된다.
 */

public class MyUncheckedException extends RuntimeException{

    //alt + insert로 편하게 생성
    public MyUncheckedException(String message) {
        super(message);
    }
}
