package access;

public class Speaker {

    private int volumn;

    Speaker(int volumn) {
        this.volumn = volumn;
    }

    void volumnUp() {
        if (volumn >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대음량입니다.");
        }else{
            volumn += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumDown() {
        volumn -= 10;
        System.out.println("volumnDown 호출");
    }

    void showVolumn() {
        System.out.println("현재 음량: " + volumn);
    }
}
