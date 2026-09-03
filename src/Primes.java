public class Primes
{
    public static void main (String args [])
    {
        int num = 153;
        int i = 2;
        boolean prime = true;
        do
        {
            if (num % i == 0 && i != num) 
            {
                  System.out.println(num + " is a NOT prime number");
                  prime=false;
                  break;
            }
            
            else 
            {
                i++;
            }
            
        }while (i<=num);
        
        if (prime==true)
        {
            System.out.println(num + " is a prime number");
        }
        

        
        }
    
}
