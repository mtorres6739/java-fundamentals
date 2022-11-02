package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheatreTest {

    @Test
    public void testForToString() {
        Theatre mathewsHouseOfFlicks = new Theatre("Mathews House of Flicks");
        mathewsHouseOfFlicks.addMovie("Night of the Living Dead");
        String expectedResult = "Theatre: Mathews House of Flicks, Movies: [Night of the Living Dead]";
        assertEquals(expectedResult, mathewsHouseOfFlicks.toString());
    }

    @Test
    public void testForRemoveMovie() {
        Theatre mathewsHouseOfFlicks = new Theatre("Mathews House of Flicks");
        mathewsHouseOfFlicks.addMovie("Night of the Living Dead");
        mathewsHouseOfFlicks.addMovie("Tales from the Darkside");
        mathewsHouseOfFlicks.addMovie("The Crazies");
        mathewsHouseOfFlicks.addMovie("Survival of the Dead");
        mathewsHouseOfFlicks.removeMovie("Survival of the Dead");
        String expectedResult = "Theatre: Mathews House of Flicks, Movies: [Night of the Living Dead, Tales from the Darkside, The Crazies]";
        assertEquals(expectedResult, mathewsHouseOfFlicks.toString());
    }

    @Test
    public void tesForAddReview() {
        Theatre mathewsHouseOfFlicks = new Theatre("Mathews House of Flicks");
        Review reviewFlicks = new Review("Mathew Torres", 4,  "This place is great!");
        mathewsHouseOfFlicks.addReview(reviewFlicks);
        mathewsHouseOfFlicks.addMovie("Night of the Living Dead");
        String expectedResult = "Theatre: Mathews House of Flicks, Movies: [Night of the Living Dead]";
        assertEquals(expectedResult, mathewsHouseOfFlicks.toString());

    }

}