public class BubbleSortExample
{
    public static void main(String [] args)
    {
        int[] data = {17, 65, 14, 51, 89, 27}; //our array

        //prints out array
        for(int j=0; j<data.length; j++)
        {
            System.out.print(data[j] + " ");
        }

        System.out.println();

        int temporaryValue = 0; //variable we're going to use for swaps

        //ensures we go through the array multiple times
        for(int pass=1; pass<data.length; pass++)
        {
            //runs through the whole array
            for(int i=0; i<data.length-1; i++)
            {
                //compares the values
                if(data[i] > data[i+1])
                {
                    temporaryValue = data[i]; //stores one value
                    data[i] = data[i+1]; //copies the second value to new location
                    data[i+1] = temporaryValue; //places first value into new location
                }
            }
        }

        //prints our sorted array
        for(int k=0; k<data.length; k++)
        {
            System.out.print(data[k] + " ");
        }
    }
}