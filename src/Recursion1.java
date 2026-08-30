public class Recursion1
{
    public static void main(String [] args)
    {
        //test recursive method
        int x = 8;
        int ans = sigmaRecursive(x);
        System.out.println("The sigma of " + x + " is " + ans);
    }

    //recursive method for sigma
    public static int sigmaRecursive(int n)
    {
        //base case
        if(n == 1)
        {
            return 1;
        }
        else
        {
            //method to call itself
            return n + sigmaRecursive(n - 1);
        }
    }
}