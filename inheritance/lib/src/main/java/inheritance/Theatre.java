package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theatre implements Reviewed {

    String name;
    ArrayList<String> movies;
    ArrayList<Review> reviews;

    public Theatre(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }


    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        if (movies == null) {
            System.out.println("No movies here.");
        } else {
            this.movies.remove(movie);
        }
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return String.format(
                "Theatre: %s, Movies: %s",
                this.name, this.movies.toString());
    }
}
