package javafundamentals.arrays;



import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int[] rolls = new int[6];
        roll(7);

        int[] test = {1,2,3,4,5};
        boolean result = containsDuplicates(test);

        int sum[] = {5,6,7,8,9,10,11,12};
        calculatingAverages(sum);

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] lowest = arrayOfArrays(weeklyMonthTemperatures);
        String lowestAsString = Arrays.toString(lowest);
        System.out.println(lowestAsString);
    }
    public static int[] roll(int n)
    {
        int[] arrayOfRolls = new int[n];
        // roll a six sided die n times
        for (int i = 0; i < n; i++)
        {

            int dice = new Random().nextInt(5) + 1;
            arrayOfRolls[i] = dice;
        }
        return arrayOfRolls;
    }

    public static boolean containsDuplicates(int[] numbs)
    {
        // does the array contain duplicates
        for (int i = 0; i < numbs.length; i++)
        {
            for (int j = i+1; j < numbs.length; j++)
            {
                if (numbs[i] == numbs[j])
                {
                    return true;
                }
            }
        }
        return false;
    }


    public static int calculatingAverages(int[] sum)
    {
        // calculate the average of the array

        int total=0;

        for (int i = 0; i < sum.length; i++)
        {
            total += sum[i];
        }
        int average = total / sum.length;
        System.out.println(average);

        return average;
    }

    public static int[] arrayOfArrays(int[][] numbers)
    {
        int lowestAverageNumber = calculatingAverages(numbers[0]);
        int[] lowestArray = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            int tempAverage = calculatingAverages(numbers[i]);
            if (tempAverage < lowestAverageNumber)
            {
                lowestAverageNumber = tempAverage;
                lowestArray = numbers[i];
            }
        }
        return lowestArray;
    }

  
    
}


    
