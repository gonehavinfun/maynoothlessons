import java.util.Scanner;

    public class Compare
    {
        public static void main (String args [])
        {
            Scanner sc = new Scanner (System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println ("Please enter first number");

            System.out.println ("Please enter another number");
            if (num1>num2)
            {
                System.out.println(num1 + ">" + num2);
            }
            else if (num1==num2)
            {
                System.out.println(num1 + "==" + num2);
            }
            else
            {
                System.out.println(num1 + "<" + num2);
            }

            
        }

    }
