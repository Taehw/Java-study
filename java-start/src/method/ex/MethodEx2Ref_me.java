package method.ex;
public class MethodEx2Ref_me {

    public static void main(String[] args) {

        printMessage(3);
        printMessage(5);
        printMessage(7);

    }

    public static void printMessage (int count){
        String message = "Hello, world!";

        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}