package enumeration.ref3;

public class ClassGradeRefMain3_3 {

    public static void main(String[] args) {
        int price = 10000;

        printDiscount(Grade.BASIC, 10000);
        printDiscount(Grade.GOLD, 10000);
        printDiscount(Grade.DIAMOND, 10000);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() +" 등급의 할인 금액: " + grade.discount(price) );
    }
}
