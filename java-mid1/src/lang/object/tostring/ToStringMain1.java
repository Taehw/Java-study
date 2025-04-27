package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString(); //클래스에 대한 정보가 문자열 형태로 저장

        //toString() 반환값 출력
        System.out.println("string = " + string);

        //object 직접 출력
        System.out.println("object = " + object);
    }
}
