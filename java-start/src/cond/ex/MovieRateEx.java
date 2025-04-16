package cond.ex;

public class MovieRateEx {

    public static void main(String[] args) {

        double rating = 9;

        //여러개가 추천돼야해서 묶어서 쓰면 안됌
        if (rating <= 9) {
            System.out.println("어바웃타임 추천함");
        }

        if (rating <= 8) {
            System.out.println("토이스토리 추천함");
        }

        if (rating <= 7) {
            System.out.println("고질라 추천함");
        }
    }
}
