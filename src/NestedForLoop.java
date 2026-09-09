public class NestedForLoop
{
    public static void main (String args[])
    {

        int sum=0;
        for (int i=1; i<=12; i++)
        {
            for (int j=1;j<=12;j++)
            {
                System.out.println(i + " * " + j + " = " + sum);
                sum=i*j;
            }
            System.out.println("*****");
        }
    }
}