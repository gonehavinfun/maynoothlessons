public class twoStrings2
{
    public static void main (String [] args)
    {
       String s1 = new String("Hello CS161"), s2 = new String("today is Tuesday");
    int len1 = s1.length(), len2 = s2.length();
    char fifth = s1.charAt(4);
    s1 = s1.toUpperCase();
    s2=s2.toLowerCase();
    String s3 = s2.replace('t','*');
    int pos = s2.indexOf('a');
    System.out.println("The length of s1: " + len1);
    System.out.println("The length of s2: " + len2);
    System.out.println("The fifth char in s1: " + fifth);
    System.out.println("s1 in uppercase: " + s1);
    System.out.println("s2 in uppercase: " + s2);
    System.out.println("s2 with all every t replaced by a *: " + s3);
    System.out.println("The first occurence of the letter a in String s2 is at position: " + pos);
    }
}
