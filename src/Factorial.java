/*
 * Task:
 * Write a Java program to calculate the factorial
 * of a given integer number.
 *
 * Example:
 * 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040
 */

public class Factorial
{
    public static void main(String [] args)
    {
        //Create a variable
        int n = 7;

        //Create a variable to hold the returned result
        int result = factorial(n);

        System.out.println("The factorial of " + n + " is " + result);
    }

    //Create the Factorial method which will return an integer
    public static int factorial(int n)
    {
        //Create a result variable to hold the factorial of n
        int result = 1;

        //Remain set to 1 as we will be multiplying. If we multiplied by 0 we would get 0
        //Create a loop to go from n down to 1
        for(int i = n; i >= 1; i--)
        {
            //Multiply the result by i
            result = result * i;
        }

        //Return the result to the main
        return result;
    }
}