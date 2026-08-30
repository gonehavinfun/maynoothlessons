public class LinearExample
{
    public static void main(String [] args)
    {
        int [] data = {16, -100, 56, 98, 11, 57, 34, 90, 65, -45, 7, 31, -19};

        int smallestValue = data[0];
        int location = 0;

        for(int i = 0; i < data.length; i++)
        {
            if(data[i] < smallestValue)
            {
                smallestValue = data[i];
                location = i;
            }
        }

        System.out.println("The smallest value was: " + smallestValue +
                           " and it was found at index: " + location);
    }
}