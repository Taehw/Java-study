package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(); //기본 생성자(매개변수x)이면 생략 가능
        System.out.println("classB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자(매개변수x)이면 생략 가능
        System.out.println("ClassB 생성자 a= " + a + " b= " + b) ;
    }
}
