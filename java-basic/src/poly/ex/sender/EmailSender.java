package poly.ex.sender;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String hello) {
        System.out.print("이메일을 발송합니다: ");
        System.out.println(hello);
    }
}
