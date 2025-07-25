package scanner;

import java.util.Scanner;

public class ScannerWhile2_re {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            System.out.println();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;

            if (num1 == 0 && num2 == 0) {
                break;
            }

            System.out.println("두 수의 합: " + sum);
        }
    }
}
