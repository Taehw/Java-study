package exception.basic.checked;

public class Client {

    //call하면 예외 터진다고 가정

    public void call() throws MyCheckedException{

        //문제가 발생해서 예외 터트려야 됨
        throw new MyCheckedException("ex");
        //예외도 객체 -> 객체를 생성하고 객체를 던져야함
        //이제 그럼 예외가 터지게 되고 이 예외를 잡거나 던져야됨
        //던지려면? -> throws MyCheckedException 선언해줘야함 : MyChecktedException 난 해결못해 이예외생기면 날 호출한곳으로 던질거야 아몰랑
    }
}
