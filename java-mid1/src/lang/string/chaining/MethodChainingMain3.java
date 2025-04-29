package lang.string.chaining;

public class MethodChainingMain3 {

    //add 메서드의 반환값을 사용하지 않음
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
