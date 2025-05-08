package generic.ex1;

//모든 타입을 담는 Box
public class ObjectBox {

    private  Object value;


    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }
}
