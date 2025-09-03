package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1;
        movieReview1 = new MovieReview();
        movieReview1.title = "타이타닉";
        movieReview1.review = "매우만족";

        MovieReview movieReview2;
        movieReview2 = new MovieReview();
        movieReview2.title = "버닝";
        movieReview2.review = "불만족";

        MovieReview[] movieReviews = new MovieReview[]{movieReview1, movieReview2};

        for(MovieReview m : movieReviews){
            System.out.println("영화 이름: " + m.title + " 리뷰 내용: " + m.review);
        }


    }
}
