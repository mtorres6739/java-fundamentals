package inheritance;

import java.util.LinkedList;

public class Shop implements Reviewed {

    String name;
    String description;
    int priceRating;
    LinkedList<Review> reviews;

    public Shop(String name, String description, int priceRating) {
        this.name = name;
        this.description = description;
        this.priceRating = priceRating;
        this.reviews = new LinkedList<>();
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return String.format(
                "Shop: %s, Description: %s, Price Rating: %s",
                this.name, this.description, this.priceRating);
    }
}
