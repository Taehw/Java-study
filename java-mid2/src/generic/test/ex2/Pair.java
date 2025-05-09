package generic.test.ex2;

public class Pair <T, K>{

    private T value1;
    private K value2;


    public T getFirst() {
        return value1;
    }

    public void setFirst(T value1) {
        this.value1 = value1;
    }

    public K getSecond() {
        return value2;
    }

    public void setSecond(K value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
