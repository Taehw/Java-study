package generic.ex4;

public class GenericMethod {

    //Object 받아서 출력해주는거
    public static Object objMethod(Object obj) {
        System.out.println("object print = " + obj);
        return obj;
    }

    //Generic 메서드 어떤 타입을 받아서 출력해주는지 호출할대 정함
    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }
    //상한이 정해진 Generic 메서드 숫자 타입만 받아서 출력해줄수 있음
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
