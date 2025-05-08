package generic.ex2;

//동물박스 생성
public class Box <T>{

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
