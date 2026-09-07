import java.util.Scanner;

    public class printEvenPosition
    {
        public static void main (String args [])
        {
            Scanner sc = new Scanner(System.in);
            String str = "";  
            String empty = "";
            int even = 0;
            System.out.println("Write your word"); 
            str = sc.nextLine(i);

            while (even<=str.length()-1)
            {
                even++;
                if (even%2==0)
                {
                    empty = empty + str.charAt(even);
                }
                System.out.println(str.charAt(even));
                 
            }

            
        }

    }
