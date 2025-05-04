package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3; //클래스 멤버변수
    private int outInstanceValuse = 2; //인스턴스 멤버변수

    static class Nested {
        private int nestedInstanceValue;

        public void print() {
            //자신의 멈베에 접근 - 당연히 가능
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에 접근할수 없다. -> 정적중첩클래스는 인스턴스에 속하지 않기 때문에
//            System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접근할수있다. 사실 누구나 접근 가능하지만 다른점은 private이어도 같은 클래스내에 있기때문에 접근이 가능
            System.out.println(outClassValue);
        }
    }
}
