package cond.ex;

public class GradeSwitchEx {

    public static void main(String[] args) {

        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과");
                break;
            case "C":
                System.out.println("준수한 성과");
                break;
            case "D":
                System.out.println("향상 필요");
                break;
            case "F":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
                break;
        }
    }
}
