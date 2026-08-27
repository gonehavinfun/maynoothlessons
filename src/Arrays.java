import java.util.Random;

public class Arrays {

	public static void main(String[] args) 
	{
		/*int arrayName[] = new int [3];
		arrayName[0] = 2;
		arrayName[1] = 5;
		arrayName[2] = -1;
		
		System.out.println(arrayName[0]);
		System.out.println(arrayName[1]);
		System.out.println(arrayName[2]);
		
		System.out.println("My length is:" + arrayName.length);
		*/
		// int arrayRaw[] = {2,5,-1}; 
		
		/*System.out.println(arrayRaw[0]);
		System.out.println(arrayRaw[1]);
		System.out.println(arrayRaw[2]);
		
		arrayRaw[2] = 100;
		System.out.println(arrayRaw[2]); */
		
		/*System.out.println("My length is:" + arrayRaw.length);
		int i;
		for (i = 0; i < 3; i++)
		{
			System.out.println (arrayRaw[i]);
		}
		*/
		/*
		for (i = 0; i<arrayRaw.length; i++)
		{
			System.out.println (arrayRaw[i]);
		}
		*/
		/* boolean defaultArray[] = new boolean [6];
		for (i = 0; i<defaultArray.length; i++)
		{
			System.out.println(defaultArray[i]);
		}
		*/ 
		
		//2D Arrays
		
		//Declare an array with 3 columns and rows
		int [][] myArray = new int [3][3];
		
		//Create a new random generator
		Random rg = new Random();
		
		//loops to fill the array with random numbers
		for (int i=0;i<myArray.length;i++)
		
		{
			for (int j=0;j<myArray.length;j++)
			{
				myArray[i][j] = rg.nextInt(1000);
				System.out.print(myArray[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		//declare an array with 5 rows
		int[][] array = new int [5][];
		
		/*Fill each row with the desired number of columns using arrays 
		 (effectively have an array of arrays)
		 */
		array[0] = new int[1];
		array[1] = new int [2];
		array[2] = new int [3];
		array [3] = new int [4];
		array[4] = new int [5];
		
		//loops to fill and print out the contents
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;i<array.length;i++)
			{
				array[i][j] = i+1;
				System.out.println(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
