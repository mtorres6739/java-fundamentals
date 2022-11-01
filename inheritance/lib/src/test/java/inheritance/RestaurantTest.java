package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {

    @Test
    public void testForToString() {
        Restaurant longhornSteakhouse = new Restaurant("Longhorn Steakhouse", 4, 4);
        Library classUnderTest = new Library();
        String expectedResult = "Restaurant: Longhorn Steakhouse, Price Rating: 4.0, Star Rating: 4.0";
        assertEquals(expectedResult, longhornSteakhouse.toString());
    }

}