package poly.diamond;

public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }
    public void methodB() {
        System.out.println("Child.methodB");
    }
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
