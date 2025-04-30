package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

//        ClassGrade newClassGrade = new ClassGrade(); //새로운 등급을 만들어버림, 우리가 정의한것만 써야되는데;;; -> 생성못하게 생서자 private 선언해버리기
//        int result = discountService.discount(newClassGrade, price);
//        System.out.println("newClassGrade 등급의 할인 급액 = " + result);
    }
}
