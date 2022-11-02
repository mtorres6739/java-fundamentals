package inheritance;

public class Review {

    String author;
    Reviewed business;
    int starRating;
    String review;


    public Review(String author, int starRating, String review) {
        this.author = author;

        if (starRating < 0) starRating = 0;
        if (starRating > 5) starRating = 5;
        this.starRating = starRating;

        this.review = review;


    }



    @Override
    public String toString() {
        return String.format(
                "Author: %s, Star Rating: %s, Review: %s",
                this.author, this.starRating, this.review);
        
    }



}
