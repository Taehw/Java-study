package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정

        integerBox.set(10);
//        integerBox.set("문자100"); //Integer타입만 허용, 컴파일오류
        Integer integer = integerBox.get(); //다운캐스팅 필요없음 알아서 Integer 반환
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();

        stringBox.set("hello"); //String 타입만 허용
        String str = stringBox.get();  //String 타입만 허용
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론 : 왼쪽읽어서 자바가 알아서 추측 - > 생성하는 제네릭 타입 생략가능
        //Integer 타입변수 쓰는 생성하는 타입도 Integer겠지~~~
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}