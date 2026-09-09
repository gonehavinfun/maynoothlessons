public class NestedWhileLoop
{
    public static void main (String args [])
    {
        int [][] myArray = new int [5][];
        myArray[0] = new int [1];
        myArray[1] = new int [2];
        myArray[2] = new int [3];
        myArray[3] = new int [4];
        myArray[4] = new int [5];

        int i=0;
        int j=0;

        while(i<=myArray.length-1)
        {
                while(j<=myArray[i].length-1)
                {
                    
                    System.out.print("#");
                    j++;
                }
                i++;
                j=0;

            System.out.println ();
        }

    }
}