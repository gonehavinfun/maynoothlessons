public class PassByValue
{
    public static void main(String [] args)
    {
        int x = 0;

        System.out.println("This is the value of x before the timesTwo method : " + x);

        x = timesTwo(10);

        System.out.println("This is the value of x after the timesTwo method : " + x);
    }

    public static int timesTwo(int x)
    {
        System.out.println("this is the value of x inside the timesTwo method : " + x);

        int result = x * 2;

        return result;
    }
}