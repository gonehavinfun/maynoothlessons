import java.util.Scanner;

public class SmallestLargest 
{
    public static void main(String args []) 
    {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];
        int smallest = array[0];
        int indexOfSmallest = 0;
        int largest = array[0];
        int indexOfLargest = 0;
        int temp;

        for (int i = 0; i < array.length; i++) 
        {
            array[i] = sc.nextInt();
        }

        smallest = array[0];

        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] < smallest)
            {
                smallest = array[i];
                indexOfSmallest = i;
            }          
        }

        largest = array[0];

        for (int j = 0; j < array.length; j++)
        {
            if (array[j] > largest)
            {
                largest = array[j];
                indexOfLargest = j;
            }
        }

        temp = array[0];
        array[0] = array[indexOfSmallest];

        


        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}