package nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2(); //빠깥 클래스의 인스턴스가 있어야되니까 먼저 생성
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass(); //생성한 인스턴스 참조주소의 내부클래스 인스턴스 생성
        innerClass.hello();
    }
}
