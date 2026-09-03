public class Backwards 
{
    public static void main (String [] args)
    {
        String sentence = new String ("pay no attention to that man behind the curtain");
        String reverse = sentence;
        for(int i = sentence.length() - 1; i >= 0; i--)
        {
            if (sentence.charAt == ' ')
            {
              String substring = reverse.substring(i);
              System.out.println(sentence);
              reverse=reverse.substring (0,1);
            }

        }

        
    }
}