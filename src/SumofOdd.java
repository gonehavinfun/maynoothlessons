import java.util.Scanner;
public class SumofOdd 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        // int size=sc.nextInt();
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int [][] myArray = new int [rows][columns];
        int oddCount=0;
        int oddSum=0;
        
        //fill
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                myArray[i][j]=sc.nextInt();
            }
        }


        // do
        for (int i=0;i<rows;i++)
        {
			for (int j=0;j<columns;j++){
                if(myArray[i][j]%2==0)
                {
                    oddCount++;
                    oddSum=oddSum + myArray[i][j];
                }


            }
            
        }

        System.out.println("Odd number count = " + oddCount);
        System.out.println("Sum of odd numbers = " + oddSum);
       
    }    

}
