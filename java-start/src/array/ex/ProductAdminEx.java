package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while(productCount <= 10) {

            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int menuNumber = scanner.nextInt();

            //swtich문으로 될려나 일단 쉬운것부터
            if (menuNumber == 1) { //continue 사용을 생각해보자
                if (productCount == 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }else {
                    scanner.nextLine();
                    System.out.print("상품 이름을 입력하세요 : ");
                    productNames[productCount] = scanner.nextLine();
                    //System.out.println(productNames[productCount]);
                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = scanner.nextInt();
                    //System.out.println(productCount);
                    productCount++;
                    //System.out.println("productCount = " + productCount);;
                }
            }

            if (menuNumber == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                }else {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                }
            }

            if (menuNumber == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
