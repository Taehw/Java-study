package lang.clazz;

//Class 클래스를 통한 인스턴스 생성
public class ClassCreateMain {

    public static void main(String[] args) throws Exception { //throws 안해주면 컴파일 오류 말생

//        Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();

        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
