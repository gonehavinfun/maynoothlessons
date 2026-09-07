import java.util.Scanner;
public class Triangle
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side A");
        double sideA = sc.nextDouble();
        System.out.println("Enter the length of side B");
        double sideB = sc.nextDouble();
        System.out.println("Enter the length of side C");
        double sideC = sc.nextDouble();
        if((sideA+sideB)>sideC && (sideB+sideC)>sideA && (sideC+sideA)>sideB)
        {
            if (sideA==sideB && sideB==sideC && sideC==sideA)
            {
                System.out.println("This is a equilateral triangle");
            }
            else if (sideA==sideB || sideB==sideC || sideC==sideA)
            {
                System.out.println("This is a isosceles triangle");
            }
            else if (sideA!=sideB && sideB!=sideC && sideC!=sideA)
            {
                System.out.println("This is a scalene triangle");
            }
        }
        else
        {
            System.out.println("This is not a triangle.");
        }
            
        

        
        
    }

}   