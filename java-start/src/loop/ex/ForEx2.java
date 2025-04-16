package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {

        int num = 2;

        for (int count = 1 ; count<= 10; count++) { //for문의 초기식과 증감식에는 여러개 넣을수 있음 아래 코드 참고
            System.out.println(num);
            num = num +2;
        }
    }

}


// 좋은 코드는 아님
//package loop.ex;
//public class ForEx2 {
//    public static void main(String[] args) {
//        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
//            System.out.println(num);
//        }
//    }
//}
