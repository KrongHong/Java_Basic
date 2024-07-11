package class1.ex;

public class MoviewReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인센션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for(int i = 0; i < movieReviews.length; i++){
            System.out.println("영화 제목 : " + movieReviews[i].title + ", 리뷰 : " + movieReviews[i].review);
        }
    }
}
