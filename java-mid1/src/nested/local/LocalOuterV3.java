package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; //지역변수 - 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer{

            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);

                //인스턴스는 지역변수보다 더 오래 살아남음->GC되기 전까지
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter(); //코드블럭안에서  class LocalPrinter 인스턴스 만들수 있음
        //printer.print();
        return  printer; //실행은 안하고 일단 반환만
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);

        printer.print();
        //printer.print();을 나중에 실행 - process()의 스택 프레임이 사라진 이후에 실행 / 그럼 process의 지역변수는 살아남지 못하나??

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}