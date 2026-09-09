import java.util.Scanner;
public class LargestRow
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int [][] myArray = new int [size][size];
        int rowSum=0;
        int largestRow=0;
        {
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    rowSum=rowSum+myArray[i][j];
                    myArray[i][j]=sc.nextInt();
                }
            }
            for (int i=0;i<size;i++)
            {
                for (int j=0;j<size;j++)
                {
                    if(rowSum>largestRow)
                    {
                        largestRow=rowSum;
                        //largestRow=???;
                    }
                }
            }
            System.out.println("Largest row = R" + largestRow);
        }
    }
}