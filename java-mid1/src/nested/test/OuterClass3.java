package nested.test;

public class OuterClass3 {

    //지역클래스
    public void myMethod() {

        class LocalClass {

            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
