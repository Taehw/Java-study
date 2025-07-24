package cond;

public class If5_re {

    public static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            System.out.println("10000원이상 구매, 1000원 할인");
            discount += 1000;
        }

        if (age <= 10) {
            System.out.println("어린이 1000원 할인");
            discount += 1000;
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
