package inheritance;

import java.util.ArrayList;

public class Restaurant {

    String name;
    double priceRating;
    double starRating;
    ArrayList<Review> reviews;

    public Restaurant(String name, double priceRating, double starRating) {
        this.name = name;
        this.priceRating = priceRating;
        this.starRating = starRating;
    }




    @Override
    public String toString() {
        return String.format(
                "Restaurant: %s, Price Rating: %s, Star Rating: %s",
                this.name, this.priceRating, this.starRating);
    }

    public void addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
        }
    }
}
