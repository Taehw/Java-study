package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {

        NestedOuter nestedOuter = new NestedOuter(); //이거 없어도 상관없음. 바깥 인스턴스랑 전혀 고나련없음 정적 중첩 클래스는
        NestedOuter.Nested nested = new NestedOuter.Nested(); //바깥클래스.중첩클래스로 접근 가능
        nested.print();
//        nestedOuter.print();

        System.out.println("nested.gq = " + nested.getClass());
    }
}
