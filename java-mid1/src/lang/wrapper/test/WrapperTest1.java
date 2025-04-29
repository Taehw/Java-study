package lang.wrapper.test;

public class WrapperTest1 {

    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int sum1 = Integer.parseInt(str1);
        int sum2 = Integer.parseInt(str2);

        int sum = sum1 + sum2;
        System.out.println("두 수의 합 : " +  sum);
    }
}
