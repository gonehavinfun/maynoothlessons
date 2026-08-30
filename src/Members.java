public class Members
{
    private String firstName;
    private String lastName;
    private static int members = 0;

    public Members(String fn, String ln)
    {
        firstName = fn;
        lastName = ln;
        members++;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getNoOfMembers()
    {
        return members;
    }
}