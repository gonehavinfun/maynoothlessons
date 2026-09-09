import java.util.Scanner;

public class EvenNumbers 
{
    public static void main(String args []) 
    {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] array = new int[10];
        int position;

        for (int i = 0; i < array.length; i++)
        {
            array[i] = input + 2;
            input = array[i];
        }

        position = sc.nextInt();

        while (position != -1)
        {
            if (position >= 0 && position < array.length)
            {
                System.out.println("Position " + position + ": " + array[position]);
            }
            else
            {
                System.out.println("Position " + position + ": No such index!");
            }

            position = sc.nextInt();
        }
    }
}