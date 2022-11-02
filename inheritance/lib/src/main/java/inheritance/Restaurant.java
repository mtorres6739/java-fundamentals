package inheritance;

import java.util.ArrayList;

public class Restaurant implements Reviewed {

    String name;
    double priceRating;
    double starRating;
    ArrayList<Review> reviews;

    public Restaurant(String name, double priceRating) {
        this.name = name;
        this.priceRating = priceRating;
        this.starRating = 0;
        reviews = new ArrayList<>();
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

        int total = 0;

        for (int i = 0; i < reviews.size(); i++) {
            total += reviews.get(i).starRating;
        }
        double average = total / reviews.size();
        this.starRating = average;
    }
}
