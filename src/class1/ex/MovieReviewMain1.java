package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        reviews[0] = inception;
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";

        MovieReview aboutTime = new MovieReview();
        reviews[1] = aboutTime;
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
