public class PrintMessage
{
    public static void main(String args[])
    {
        double balance = 100;
        double money = 50;
        double new_balance = 0;

        if ((balance - money) < 0)
        {
            System.out.println("You dont have enough money.");
        }
        else
        {
            new_balance = balance - money;
            System.out.println("Balance is " + new_balance);
        }
    }
}