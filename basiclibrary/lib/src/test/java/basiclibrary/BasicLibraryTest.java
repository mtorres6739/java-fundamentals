package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BasicLibraryTest {

    @Test void testForRollDice () {
        BasicLibrary basicLibrary = new BasicLibrary();
        int[] rollResults = basicLibrary.roll(6);
        System.out.println(Arrays.toString(rollResults));
        assertTrue(rollResults.length == 6);

    }

    @Test void testForContainsDuplicates () {
        BasicLibrary basicLibrary = new BasicLibrary();
        int[] test = {1,2,3,4,5};
        assertFalse(basicLibrary.containsDuplicates(test));
    }

    @Test void testForCalculatingAverages () {
        BasicLibrary basicLibrary = new BasicLibrary();
        int sum[] = {5,6,7,8,9,10,11,12};
        float sumAvg = 8.5f;
        assertEquals(basicLibrary.calculatingAverages(sum), sumAvg);
    }

    @Test void testForArrayOfArrays () {
        BasicLibrary basicLibrary = new BasicLibrary();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int [] testAns = {55, 54, 60, 53, 59, 57, 61};
//        int[] lowest = basicLibrary.arrayOfArrays(weeklyMonthTemperatures);
//        String lowestString = Arrays.toString(lowest);
//        System.out.println(lowestString);
        assertEquals(basicLibrary.arrayOfArrays(weeklyMonthTemperatures), testAns);
    }
}
