
public class elseIf {

	public static void main(String[] args) 
	{
		int score = 20;
		{
			if (score >= 80)
			{
				System.out.println("Grade:A");
			}
			else if(score >= 65)
			{
				System.out.println("Grade:B");
			}
			else if (score >= 55)
			{
				System.out.println("Grade:C");
			}
			else if(score >=45)
			{
				System.out.println("Grade:D");
			}
			else if (score >=35)
			{
				System.out.println("Grade:C");
			}
			else 
			{
				System.out.println("Grade:Fail");
			}
		}

	}

}
