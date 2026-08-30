public class TryCatchEx
{
    public static void main(String[] args)
    {
        int[] myArray = {3,4,6,8,1,3};

        try
        {
            for(int i = 0; i < myArray.length; i++)
            {
                System.out.println(myArray[i]); //Prints out the content of the array
            }
        }
        catch(Exception e)
        {
            System.out.println("An error occurred : " + e);
        }
        finally
        {
            System.out.println("This part will always execute");
        }

        int x = 7, y = 3, z = 4;
        int product = x * y * z;
        System.out.println(product);
    }
}