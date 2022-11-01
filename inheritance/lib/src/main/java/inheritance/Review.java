package inheritance;

public class Review {

    String author;
    Reviewed business;
    int starRating;
    String review;


    public Review(String author, Restaurant business, int starRating, String review) {
        this.author = author;
        this.business = null;

        if (starRating < 0) starRating = 0;
        if (starRating > 5) starRating = 5;
        this.starRating = starRating;

        this.review = review;


    }


    @Override
    public String toString() {
        return String.format(
                "Author: %s, Business: %s, Star Rating: %s, Review: %s",
                this.author, this.business, this.starRating, this.review);
        
    }


    public short addReview(Review longhornReview) {
        return 0;
    }
}
