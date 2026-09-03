
public class ForPalindrome 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for (int i=100; i<999;i++)
		{
			
			if (i%10==i/100);
			{
				count++;
				System.out.println(i + ",");
			}
		}
		
		System.out.println("There are " + count + "three digit palindromes!");

	}

}
