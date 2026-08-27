
public class BlockScope {

	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int sum = 9;

		for (int i=1;i<=10;i++)
		{
			int added = i+i;
			sum = sum + added;
		}
		System.out.println(sum);
		*/
		
		for (int i=1;i<=10;i++)
		{
			int added = i+i;
			sum = sum + added;
		}
		System.out.println("This is the value of sum after the loop:" + sum);
		sum = average(sum,90);
		System.out.println("This is the value of sum after the average methid was called:" + sum);
	}
	
	public static int average (int first, int second)
	{
		sum = (first + second)/2;
		return sum;
	}
}
