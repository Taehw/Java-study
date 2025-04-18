package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {

        //변수이름 좀 더 신경써주기

        MovieReview Movie1 = new MovieReview();
        Movie1.title = "인셉션";
        Movie1.review = "인생은 무한 루프";
        
        MovieReview Movie2 = new MovieReview();

        Movie2.title = "어바웃 타임";
        Movie2.review = "인생 영화";

        System.out.println("영화 제목 : " + Movie1.title + ", 리뷰: " + Movie1.review);
        System.out.println("영화 제목 : " + Movie2.title + ", 리뷰: " + Movie2.review);
    }
}
