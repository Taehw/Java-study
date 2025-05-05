package nested.test;

public class OuterClass1 {

    //정적중첩 클래스
    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello"); //soutm으로 편하게 생성하기
        }
    }
}
