package nested.inner;

public class innerOuter {

    private static int outClassValue = 3;
    public int outInstanceValue = 2;

    class Inner { //내부 클래스 선언 - static x-> instace 멤버
        private int innerInstanceValue = 1;

        public void print() {
            //자기 자신에 접근
            System.out.println(innerInstanceValue);

            //외부 클래스의 인스턴스 멤버에 접근 가능, private도 적ㅂ근 가능
            System.out.println(outInstanceValue);

            System.out.println(outClassValue); //당연하죠? 외부클래스의 클래스 멤버에 접근
        }
    }
}
