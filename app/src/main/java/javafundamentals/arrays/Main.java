package javafundamentals.arrays;



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


    public static int[] calculatingAverages(int[] sum)
    {
        // calculate the average of the array

        int total=0;

        for (int i = 0; i < sum.length; i++)
        {
            total += sum[i];
        }
        int average = total / sum.length;
        System.out.println(average);

        return new int[]{average};
    }


  
    
}


    
