package static2.ex;

import static static2.ex.MathArrayUtils.*; //더 깔끔하게 static import해주기

public class MathArrayUtilsMain {

    public static void main(String[] args) {

        //요구사항
        //인스턴스 생성안되게 private 생성자 만들고호출

        int[] values = {123,14,124,212,12};

        //클래스에 바로 접근해서 사용하고 있네
        System.out.println("sum= " + sum(values));
        System.out.println("average= " + average(values));
        System.out.println("min= " + min(values));
        System.out.println("max= " + max(values));
    }
}
