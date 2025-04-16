package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요 : ");

        int[] numbers = new int[5];
        int sum = 0;

        //개수가 정해져있으니까 length를 굳이 안써도 되긴함
        // for문두개는 합치는게 낫지...정답코드 확인
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + (double)sum / 5);


    }
}
