package operator;
public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2 - 변수로 더하기
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1 - 자바가 10을 문자로 바꿔줌
        String result3 = "a + b = " + 10;
        System.out.println(result3);
        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}