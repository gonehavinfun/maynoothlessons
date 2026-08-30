public class BinarySearch
{
    public static void main(String [] args)
    {
        int [] array = {5, 19, 23, 28, 43, 67, 86, 89, 92, 107, 10, 114, 156};
        int target = 19;
        int high = array.length - 1;
        int low = 0;
        int middle = 0;
        boolean found = false;

        while (low <= high && !found)
        {
            middle = (high + low) / 2;

            if (array[middle] > target) // search in the lower space
            {
                high = middle - 1;
            }
            else if (array[middle] < target) // search the higher space
            {
                low = middle + 1;
            }
            else
            {
                System.out.println(target + " found at position " + middle);
                found = true;
            }
        }

        if (!found)
        {
            System.out.println(target + " was not found in the list");
        }
    }
}