//오히려 전에 정답코드랑 다르게 작성했던게 도움이 됐네
//Ex7 -> Ex8 디벨롭하는데 몇줄이면 끝남 개이득

package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요 : ");
        int studentCount = scanner.nextInt();
        int[][] students = new int[studentCount][3]; //변수명도 좀 신경써주자

        int[] totalscores = new int[studentCount];
        int totalscore = 0;

        for (int row = 0; row < students.length; row++) {
            System.out.println((row+1) + "번 학생의 성적을 입력하세요 :");
            for (int column = 0; column < students[row].length; column++) {

                if (column == 0) {
                    System.out.print("국어점수 : ");
                    students[row][column] = scanner.nextInt();
                }
                if (column == 1) {
                    System.out.print("영어점수 : ");
                    students[row][column] = scanner.nextInt();
                }
                if (column == 2) {
                    System.out.print("수학점수 : ");
                    students[row][column] = scanner.nextInt();
                }

                totalscore += students[row][column];
            }
            totalscores[row] = totalscore;
            totalscore = 0;
        }

        for (int i = 0; i < students.length; i++) {

            double average = (double)totalscores[i] / 3;

            System.out.println((i+1) + "번 학생의 총점: " + totalscores[i] +". " + "평균: " + average);
        }
    }
}
