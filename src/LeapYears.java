public class LeapYears
{
    public static void main (String args [])
    {
        int currentyear=2026;
        int nextyear=0;
        for(int i=0;i<=100;i++){
            nextyear = currentyear+i;
            if(nextyear%400==0 || nextyear%4==0 && nextyear%100!=0)
            {
                System.out.println(nextyear + " a leap year");

            }
            else
            {
                System.out.println(nextyear + " is not a leap year");
            }
        }
    }
}