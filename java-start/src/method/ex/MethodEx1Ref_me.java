package method.ex;

public class MethodEx1Ref_me {

    public static void main(String[] args) {

        calAverage(1, 2, 3);
        calAverage(15,25,35);
    }

    public static void calAverage(int a, int b, int c){

        int sum = a + b + c;

        double average = sum / 3.0;

        System.out.println("평균값 : " + average);
    }
}