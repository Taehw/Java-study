package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = scanner.nextInt();

        System.out.println(count + "개의 정수를 입력하세요:");
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) { //int i = 0 보다 int i =1부터 하는게 시간상 이득
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
