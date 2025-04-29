package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //오토박싱 - 컴파일단꼐에서 알아서 Integer.valueOf() 추가

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; //오토 언박싱 - 컴파일단꼐에서 알아서 intValue() 추가

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
