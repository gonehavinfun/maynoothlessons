public class Switch
{
    public static void main (String args [])
    {
int moduleName = 171;

switch(moduleName)
{
    case 130:
        System.out.println("Databases");
        break;

    case 161:
        System.out.println("Intro to CS");
        break;

    case 171:
        System.out.println("Computer Systems");
        break;

    case 210:
        System.out.println("Algorithms and Data Structures");
        break;

    default:
        System.out.println("Not a module");
}
    }
}