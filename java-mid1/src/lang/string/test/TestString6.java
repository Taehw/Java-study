package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key); //6 - h
//        System.out.println("index = " + index);

        while (index >= 0) { //끝까지 찾을때까지
            index = str.indexOf(key, index + 1); //index 범위를 넘어가면 0이 되잖앙
            //1차 - 7번 인덱스 부터 hello 찾음 18
            //2차 - 19번 인데스부터 hello 찾음 32
            //3차 - 33번 인덱스부터 찾는데 없잖아 - 없으면 -1을 반환
            System.out.println("index in while = " + index);
            count++;
        }
        System.out.println("count = " + count);
    }
}
