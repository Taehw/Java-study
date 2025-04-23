package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value); //child
        child.method(); //child.method

        //부모변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value); //parent
        parent.method(); //parent.method

        //부모변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value" + poly.value); //parent
        poly.method(); //child.method

    }
}
