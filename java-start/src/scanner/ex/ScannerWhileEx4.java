package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3 : 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine(); //이전에 입력된 개행문자 제거

            if (option == 1) {
                System.out.print("상품명을 입력하세요 : ");
                String productName = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요 : ");
                int productPrice = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요 : ");
                int productQuantity = scanner.nextInt();

                int totalprice = productPrice * productQuantity; // 굳이 변수가 많나?
                sum += totalprice; // 이것도 이름이 중복되는느낌 코드의 가독성을 항상 생각하자

                System.out.println("상품명: " + productName + " 가격: " + productPrice + " 수량: " + productQuantity + " 합계: " + totalprice);
            } else if (option == 2) {
                System.out.println("총 비용 : " + sum);
                sum = 0;
                //System.out.println(sum);
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
