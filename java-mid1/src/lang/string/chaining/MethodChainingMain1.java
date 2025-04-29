package lang.string.chaining;

public class MethodChainingMain1 {

    //add 메서드의 반환값을 사용하지 않음
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);
        int result = adder.getValue();

        System.out.println("result = " + result);
    }
}
