import java.util.Scanner;
public class SumOfDiagonals
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int [] [] myArray = new int[size][size];
        int sum1=0;
        int sum2=0;
        int sum=0;
        for (int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                myArray[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i<size; i++)
        {
            for (int j = 0; j<size; j++)
            {
                if (i==j)
                {
                    sum1=sum1+myArray[i][j];
                }
                if(i+j==myArray.length-1)
                {
                    sum2=sum2+myArray[i][j];
                }

            }
        }
        sum = sum1 + sum2;

        System.out.println("Sum of diagonals = " + sum);

    }
}