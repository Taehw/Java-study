package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {

        //변수이름 좀 더 신경써주기
        
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        
        MovieReview aboutTime = new MovieReview();

        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 영화";

        MovieReview[] movieReviews = {inception, aboutTime};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목 : " + movieReview.title + ", 리뷰: " + movieReview.review);
        }

    }
}
