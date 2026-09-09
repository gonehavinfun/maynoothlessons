import java.util.Scanner 
public class SumProduct
{
    public static void main (String args [])
    { 
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;
        int product = 1;
        int largest = 0;
         for (int i = 0; i < array.length; i++) 
        {
            array[i] = sc.nextInt();
        }
    for (int i = 0; i < array.length; i++) 
        {
            sum += array[i];
            product *= array[i];

            if (array[i] > largest)
            {
                largest = array[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest Number: " + largest);
    }
}