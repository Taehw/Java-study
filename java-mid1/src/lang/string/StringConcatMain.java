package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b; //참조값끼리 더하는것 허용

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
