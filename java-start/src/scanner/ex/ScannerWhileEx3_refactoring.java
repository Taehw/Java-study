package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3_refactoring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum  = 0;
        int count = 0;
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");

        while (true) {

            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            sum += number;
            count++;
        }
        //반복문 예제2 - 실제 이렇게 쓰는 경우가 많음

/*
         while ((input = scanner.nextInt()) != -1) {
         sum += input;
         count++;
         }
*/

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);
    }
}
