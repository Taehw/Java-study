package enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //오타발생하기 쉽고, 유효하지 않는 값이 입력될수도 있음
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("basic등급의 할인 금액 = " + basic);
        System.out.println("gold등급의 할인 금액 = " + gold);
        System.out.println("diamond등급의 할인 금액 = " + diamond);

    }
}
