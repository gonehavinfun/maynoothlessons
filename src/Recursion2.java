public class Recursion2
{
    public static void main(String [] args)
    {
        //for loop to print the sequence
        for(int i=0; i<=8; i++)
        {
            int x = fibonacci(i);
            System.out.println("The fibonacci of " + i + " is " + x);
        }
    }

    //Recursive fibonacci sequence
    public static int fibonacci(int n)
    {
        //base case
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            //method to call itself
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}