package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {

    @Test
    public void testForToString() {
        Restaurant longhornSteakhouse = new Restaurant("Longhorn Steakhouse", 4);
        Review longhornReview = new Review("Mathew Torres", 4,  "This is a good restaurant");
        Library classUnderTest = new Library();
        String expectedResult = "Author: Mathew Torres, Star Rating: 4, Review: This is a good restaurant";
        assertEquals(expectedResult, longhornReview.toString());
    }

    @Test
    public void testForAddReview() {
        Restaurant longhornSteakhouse = new Restaurant("Longhorn Steakhouse", 4);
        Review longhornReview = new Review("Mathew Torres", 4,  "This is a good restaurant");
        longhornSteakhouse.addReview(longhornReview);
        String expectedResult = "Author: Mathew Torres, Star Rating: 4, Review: This is a good restaurant";
        assertEquals(expectedResult, longhornReview.toString());
    }

}