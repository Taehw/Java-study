package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //향상된 for문
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
        //향상된 for문을 사용하지 못하는경우
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i번째 배열의 숫자는 " + numbers[i] + "입니다.");
        }
    }

}
