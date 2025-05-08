package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); //원랜 < > 으로 타입 지정정해줘야 되는데 안했음
        //타입지정안하면 자동으로 Object 타입으로 생성
        //GenericBox<Object> integerBox = new GenericBox<>();

        //rawType은 왜 존재하는거지? -> 다운캐스팅도 해야되고 타입안정성이 보장이 안되는뎅...
        integerBox.set(10);

        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
