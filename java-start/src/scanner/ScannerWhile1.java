package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //

        while (true) {
            System.out.print("문자열을 입력하세요 : ");
            String str = scanner.nextLine();

            if (str.equals("exit")) { //문자열 비교는 equals
                break;
            }

            System.out.println("str = " + str);
        }
    }
}
