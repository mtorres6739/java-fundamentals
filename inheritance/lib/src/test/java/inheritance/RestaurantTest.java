package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {

    @Test
    public void testForToString() {
        Restaurant longhornSteakhouse = new Restaurant("Longhorn Steakhouse", 4);
        String expectedResult = "Restaurant: Longhorn Steakhouse, Price Rating: 4.0, Star Rating: 0.0";
        assertEquals(expectedResult, longhornSteakhouse.toString());
    }

    @Test
    public void tesForAddReview() {
        Restaurant longhornSteakhouse = new Restaurant("Longhorn Steakhouse", 4);
        Review reviewSteakhouse = new Review("Mathew Torres", 4,  "This place is great!");
        longhornSteakhouse.addReview(reviewSteakhouse);
        String expectedResult = "Restaurant: Longhorn Steakhouse, Price Rating: 4.0, Star Rating: 4.0";
        assertEquals(expectedResult, longhornSteakhouse.toString());

    }

}