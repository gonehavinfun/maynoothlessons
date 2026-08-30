/*
 * Task:
 * Create an array of numbers and create a method that returns
 * the sum of all the values in the array.
 *
 * The method should take an array as a parameter,
 * calculate the total of all values,
 * and return the result.
 */

public class SumArray
{
    public static void main(String [] args)
    {
        //Create an array
        int [] array = {4,5,7,8,10,11};

        //Create a variable to store the returned result
        int result = sumArray(array);

        //Print out the result
        System.out.println("The sum of the values in the array is " + result);
    }

    //Create a method to return the sum of all the values of an array
    public static int sumArray(int [] array)
    {
        //Create a variable to hold the total of the values of the array
        int result = 0;

        //Create a loop to iterate through the array
        for(int i = 0; i < array.length; i++)
        {
            //Add the value of the array into result
            result = result + array[i];
        }

        //Return the variable result
        return result;
    }
}