public class ChangeValue
{
    public static void main(String [] args)
    {
        //Create an array
        int [] array = {1,2,3,4};

        //Calling the printArray Method from the main
        System.out.println("This is from the main.");
        printArray(array);

        System.out.println("");

        //Calling the changeValue Method
        changeValue(array);

        //Print the array from the main method again
        System.out.println("");
        System.out.println("This is from the main method");
        printArray(array);
    }

    //Create a method to change a value in an array
    public static void changeValue(int [] array)
    {
        //Change the second value of the array
        array[1] = 9;

        //Print the array out
        System.out.println("This is from the changeValue method");
        printArray(array);
    }

    //Create a method to print out the array
    public static void printArray(int [] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}