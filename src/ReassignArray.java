public class ReassignArray
{
    public static void main(String [] args)
    {
        //Create an array
        int [] array = {1,2,3,4};

        //Print the array out
        System.out.println("This is from the main");
        printArray(array);

        System.out.println("");

        //Calling the reassignArray Method
        reassignArray(array);

        //Print out array again
        System.out.println("This is from the main Method");
        printArray(array);
    }

    //Create a method to reassign the array
    public static void reassignArray(int [] array)
    {
        //Create another array
        int [] array2 = {6,7,8,9};

        //Set array equal to array2
        array = array2;

        //Print array
        System.out.println("This is from the reassignArray Method");
        printArray(array);
    }

    //Create a method to print the array
    public static void printArray(int [] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}