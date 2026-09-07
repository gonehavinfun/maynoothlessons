public class String6
{
    public static void main (String args [])
    {
        String s = new String ("Hello World");
        String empty = "";
        for(int i=s.length()-1; i>=1; i--)
        {
            if (s.charAt(i)== ' ')
            {
                empty = s.substring(i+1);
                break;
            }
            
        }
        System.out.println(empty.length());
    }
}