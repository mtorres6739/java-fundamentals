package inheritance;

public interface Reviewed {
     default void addReview(Review review) {}
}
