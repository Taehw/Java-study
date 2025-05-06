package exception.ex4;



import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {

//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input); //던져
            } catch (Exception e) {

            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종룧바니다.");
    }
}
