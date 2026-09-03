
public class PersonsAge {
	public static void main(String args [])
	{
		int age = 18;
		
		if (age<=12)
		{
			System.out.println("You are a child");
		}
		else if (age>=13 && age<=19)
		{
			System.out.println("You are a teenager");
		}
		else if (age>=20 && age<=25)
		{
			System.out.println("You are a young adult");
		}
		else if (age>=26 && age<=70)
		{
			System.out.println("You are an adult");
		}
		else if (age>=71)
		{
			System.out.println("You are a elderly");
		}
		else 
		{
			System.out.println("Invalid");
		}
	}

}
