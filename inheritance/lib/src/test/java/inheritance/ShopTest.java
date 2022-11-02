package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {

    @Test
    public void testForToString() {
        Shop mathewsWidgets = new Shop("Mathews Widgets", "Big house of widgets.", 4);
        String expectedResult = "Shop: Mathews Widgets, Description: Big house of widgets., Price Rating: 4";
        assertEquals(expectedResult, mathewsWidgets.toString());
    }

    @Test
    public void tesForAddReview() {
        Shop mathewsWidgets = new Shop("Mathews Widgets", "Big house of widgets.", 4);
        Review reviewWidgets = new Review("Mathew Torres", 4,  "This place is great!");
        mathewsWidgets.addReview(reviewWidgets);
        String expectedResult = "Shop: Mathews Widgets, Description: Big house of widgets., Price Rating: 4";
        assertEquals(expectedResult, mathewsWidgets.toString());

    }

}