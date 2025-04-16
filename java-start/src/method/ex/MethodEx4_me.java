package method.ex;

import java.util.Scanner;

public class MethodEx4_me {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
            System.out.println("-------------------------------------");

            System.out.print("선택: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요: ");
                int depositAmount = scanner.nextInt(); //영한쌤 풀이 보기 amount 변수 하나로 진행하면 된다. 더 읽기? 좋다.
                balance = deposit(balance, depositAmount);

            } else if (menu == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                balance = withdraw(balance, withdrawAmount);

            } else if (menu == 3) {
                System.out.println("현재 잔액: " + balance);

            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                //break; 
                return; //main 문 자체를 끝내버림, 영한쌤은 switch를 써서 return으로 했음
            } else {
                System.out.println("잘못된 입력입니다. 다시입력하세요");
                continue;
            }

        }
    }

    public static int deposit(int balance, int depositAmount){

        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount){

        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니 다.");
        }

        return balance;
    }
}