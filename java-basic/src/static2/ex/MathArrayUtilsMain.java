package static2.ex;

public class MathArrayUtilsMain {

    public static void main(String[] args) {

        //요구사항
        //인스턴스 생성안되게 private 생성자 만들고호출

        int[] values = {123,14,124,212,12};

        //클래스에 바로 접근해서 사용하고 있네
        System.out.println("sum= " + MathArrayUtils.sum(values));
        System.out.println("average= " + MathArrayUtils.average(values));
        System.out.println("min= " + MathArrayUtils.min(values));
        System.out.println("max= " + MathArrayUtils.max(values));
    }
}
