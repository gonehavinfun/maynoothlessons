import java.util.Scanner;


public class KeyboardInput {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		
		//__________Security Questions____________//
	{
		Scanner scan = new Scanner(System.in);
		
			//Name
		
		System.out.println("Enter ypur full name:");
		String fullName = scan.nextLine();
		System.out.println("Your name is " + fullName);
		
		//Age
		
		System.out.println("Enter your age:");
		int yourAge = scan.nextInt();
		System.out.println("Your age is: " + yourAge);
		
		//Capture Code
		System.out.println("Enter captcha code [1.2593]:");
		double captchaCode = scan.nextDouble();
		System.out.println("Captcha Code: " + captchaCode );
	}

}
