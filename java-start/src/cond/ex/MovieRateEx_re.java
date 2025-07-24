package cond.ex;

public class MovieRateEx_re {

    public static void main(String[] args) {

        double rating = 8.1;

        if (rating >= 9) {
            System.out.println("'어버웃타임'을 추천합니다");
        } else if (rating >= 8) {
            System.out.println("'어버웃타임'을 추천합니다");
            System.out.println("'토이스토리'을 추천합니다");
        } else if (rating >= 7) {
            System.out.println("'어버웃타임'을 추천합니다");
            System.out.println("'토이스토리'을 추천합니다");
            System.out.println("'고질라'을 추천합니다");
        }

    }
}
