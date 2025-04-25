package poly.ex.sender;

public class FaceBookSender implements Sender{


    @Override
    public void sendMessage(String hello) {
//        System.out.print("페이스북에 발송합니다: ");
//        System.out.println(hello);
        System.out.println("페이스북에 발송합니다: " + hello);

//        그냥 이렇게 하는게 훨 낫죠?
    }
}
