package exception.ex3;


import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) {

        NetworkServiceV3_2 networkServiceV5 = new NetworkServiceV3_2();

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
