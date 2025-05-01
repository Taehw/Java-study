package enumeration.test.ex1;


import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {

        //1. 입력받은 인증 등급을 열거형으로 변환 -> valueOf
        //2. 인증등급 마다 화면 구현하기 -> 메뉴 목록까지는 동일
        //3. 잘못된 값이 입력되는 경우도 고려

        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
            AuthGrade grade = AuthGrade.valueOf(input.nextLine());


            System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
            System.out.println("==메뉴 목록==");

            if (grade == AuthGrade.GUEST) {
                System.out.println("- 메인화면");
            } else if (grade == AuthGrade.LOGIN) {
                System.out.println("- 메인화면");
                System.out.println("- 이메일 관리 화면");
            } else if (grade == AuthGrade.ADMIN) {
                System.out.println("- 메인화면");
                System.out.println("- 이메일 관리 화면");
                System.out.println("- 관리자 화면");
            }

            //Level 을 활용 cool
            System.out.println("==메뉴 목록==");
            if (grade.getLevel() > 0) {
                System.out.println("- 메인 화면");
            }
            if (grade.getLevel() > 1) {
                System.out.println("- 이메일 관리 화면");
            }
            if (grade.getLevel() > 2) {
                System.out.println("- 관리자 화면");
            }
        }


    }
}
