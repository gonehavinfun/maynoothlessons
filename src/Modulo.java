
public class Modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//take an arbitrary number
		int original = 349;
		
		//variables to hold each digit
		int num1, num2, num3;
		
		//get the using mod
		num1 = original % 10;
		
		//reduce original
		original = original / 10;
		
		//print out the results
		System.out.println("Units is " + num1);
		System.out.println("original is now " + original);
		
		//get the tens using mod
		num2 = original % 10;
		original = original / 10;
		System.out.println("tens is " + num2);
		System.out.println("original is now " + original);
		
		//get the hundreds
		num3 = original;
		System.out.println("hundreds is " + num3);
		
		System.out.println("The digits in 349 are ");
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(num1);
		
		
		
		

	}

}
