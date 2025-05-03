package nested.anonymous.ex;

import java.util.Random;

//정적 중첩 클래스 사용
public class Ex1RefMainV1 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");

    }

    static class Dice implements Process{

        @Override
        public void run() {
            //코드 조각 시작
            int randomValue = new Random().nextInt(6) + 1;//1~6까지 랜덤 숫자 생성
            System.out.println("주사위 = " + randomValue);
            //코드 조각 종료

        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            //코드 조각 시작
            for (int i = 1; i <= 3; i++) {
                System.out.println("i= " + i);
            }
            //코드 조각 종료
        }
    }

    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}
