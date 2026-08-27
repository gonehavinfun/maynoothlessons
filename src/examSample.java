/*
 Write a method that will multiply each element of a two dimensional array by 5 and return the array
 Call this method in the main method and then print out the elements of the array in the main method
 Use the array numberGrid given by the following code:
 int numberGrid = {{2,4,6}, {1,5,7}, {14,2,9}};
*/

public class examSample
{
    public static void main(String[] args)
    {

        // Initialise the array and fill it with the given values
        int[][] numberGrid = {{2,4,6}, {1,5,7}, {14,2,9}};
        
        int[][] newNumberGrid = timesFive(numberGrid);

        for(int i=0;i<newNumberGrid.length;i++)
        {
            for(int j=0;j<newNumberGrid.length;j++)
            {
                System.out.print(newNumberGrid[i][j] + " ");
            }
            System.out.println();
        }
    }


    // Write the method to multiply each element of the array by 5 using nested loops
    public static int[][] timesFive(int[][] numberGrid)
    {

        //loops to multiply by 5
        for(int i=0;i<numberGrid.length;i++)
        {
            for(int j=0;j<numberGrid.length;j++)
            {
                numberGrid[i][j] = numberGrid[i][j] * 5;
            }
        }

        return numberGrid;
    }
}