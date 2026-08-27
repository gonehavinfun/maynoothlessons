	
public class CastingandConvertng {

	public static void main(String[] args) {
	
		//Example 1
		String num = "4";
		int x = Integer.parseInt (num);
		System.out.println(x);
		
		//Example 2
		int y = 44;
		String ans = Integer.toString(y);
		System.out.println(y);
		
		//Example 3
		int z = 'a';
		System.out.println(z);
		
		//Example 4
		int integer = 400;
		double decimal = integer; 
		System.out.println(decimal);
		
		//Example 5
		double number = 43.8;
		int q = (int)number;
		System.out.println(q);

	}

}
