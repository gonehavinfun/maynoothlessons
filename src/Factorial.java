
public class Factorial
{
    public static void main(String args [])
    {
        int n = 4;

        int result = factorial(n);

        System.out.println("The factorial of " + n + " is " + result);
    }

    public static int factorial(int n)
    {
        int result = 1;

        for(int i = n; i >= 1; i--)
        {
            result = result * i;
        }

        return result;
    }
}