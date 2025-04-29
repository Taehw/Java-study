package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int totalLength = 0;
        //코드 작성
        for (String string : arr) {
            System.out.println(string + ":" + string.length());
            totalLength += string.length();
        }
        System.out.println("sum = " + totalLength);
    }
}
