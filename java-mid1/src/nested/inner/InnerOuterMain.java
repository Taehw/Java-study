package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        innerOuter outer = new innerOuter();
        innerOuter.Inner inner = outer.new Inner(); //생성 방법이 좀 특이, 바깥족 인스턴스의 참조를 알아야함 x001.new Inner()
        //어느 인스턴스에 소속이 된건지 어느 인스턴스 안에 만들건지

        inner.print();
    }
}
