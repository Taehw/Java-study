package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20); //기본생성자가 아니라서 내가 super를 직접 조작해줘야함
        System.out.println("ClassC 생성자");
    }
}
