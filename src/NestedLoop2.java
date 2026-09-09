import java.util.Scanner;
import java.util.Random;
public class NestedLoop2{
	public static void main (String args[]){
		int [][] matrix;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.print("Please enter row:");
		int row = input.nextInt();

		System.out.print("Please enter col:");
		int col = input.nextInt();

		if (row >=1 && col>=1){ //safety check
			matrix = new int[row][col];

			for (int i=0;i<matrix.length;i++){
				for (int j=0;j<matrix[0].length;j++){
					matrix[i][j]=generator.nextInt(201);
					sum = sum + matrix[i][j];
					//Random.nextInt(k); 	
				}
			}
			/**
			* for (int i =0;array.length;i++)
				sum+=array[i] // sum  =  sum + array[i];
			*/
			
			for (int i=0;i<matrix.length;i++){
			 	for (int j=0;j<matrix[0].length;j++){
			 		System.out.print(matrix[i][j]+" ");
			 	}
			 	System.out.println();
			}

			System.out.println("Sum of this matrix is:"+sum);
		}
	}

}