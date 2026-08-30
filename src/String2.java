public class String2
{
    public static void main(String[] args)
    {
        String m = new String("Monika");
        String g = new String("Gawecka");
        String mg = (m + g);

        System.out.println(m.toLowerCase());//converts the string to lower case.
        System.out.println(m.toUpperCase());//converts the string to upper case.
        System.out.println(m.length());//returns the length of a string.
        System.out.println(m.replace('M','S'));//returns new string as strings are immutable.
        System.out.println(m.charAt(2));//Strings start at position 0.
        System.out.println(mg.indexOf('k'));//it will only return the first instance.
        System.out.println(g.substring(0,1));

        g = g.substring(0,1);
        System.out.println(g);
    }
}