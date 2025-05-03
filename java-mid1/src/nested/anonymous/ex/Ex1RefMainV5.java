package nested.anonymous.ex;

import java.util.Random;

//람다 사용
public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");

    }

    public static void main(String[] args) {

        //클래스 인스턴스를 정의하지 않고, 메서드의 코드 블럭을 직접 전달하는 것을 확인
        hello(() -> {
            //코드 조각 시작
            int randomValue = new Random().nextInt(6) + 1;//1~6까지 랜덤 숫자 생성
            System.out.println("주사위 = " + randomValue);
            //코드 조각 종료

        });
        hello(() -> {
            //코드 조각 시작
            for (int i = 1; i <= 3; i++) {
                System.out.println("i= " + i);
            }
            //코드 조각 종료
        });
    }
}
