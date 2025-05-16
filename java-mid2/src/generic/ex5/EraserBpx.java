package generic.ex5;

public class EraserBpx {

    public boolean instanceCheck(Object param) {
        //retrun param instanceof T; // 컴파일 오류
        return false;
    }

    public void create() {
        //return new T(); // 오류
    }
}
