public class Summing
{
    public static void main (String args [])
    {
        int sum1=0;
        int sum2=0;
        for (int num=1;num<=100;num++)
        {
            if(num%13==0)
            {
                sum1=sum1+num;

            }
            sum2+=num*num;
            
        }

        System.out.println("The sum of all numbers divisible by 13 is " + sum1 );
        System.out.println("The sum of all squares is " + sum2 );
    }
}