package cond.ex;

public class CondOpEx {

    public static void main(String[] args) {
        int a = 20;
        int b = 20;

        int max = (a > b) ? a : b; //괄호로 코드가독성, 변수명 명확하게

        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
