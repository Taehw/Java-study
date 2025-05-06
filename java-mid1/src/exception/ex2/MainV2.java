package exception.ex2;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {

//        NetworkServiceV2_1 networkServiceV1 = new NetworkServiceV2_1();
//        NetworkServiceV2_2 networkServiceV2 = new NetworkServiceV2_2();
//        NetworkServiceV2_3 networkServiceV3 = new NetworkServiceV2_3();
//        NetworkServiceV2_4 networkServiceV4 = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkServiceV5 = new NetworkServiceV2_5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }
            networkServiceV5.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종룧바니다.");
    }
}
