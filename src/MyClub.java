public class MyClub
{
    public static void main(String[] args)
    {
        Members member1 = new Members("George", "Clooney");
        System.out.println(member1.getFirstName() + " " + member1.getLastName() + " no of members: "
                + member1.getNoOfMembers());

        Members member2 = new Members("Brad", "Pitt");
        System.out.println(member2.getFirstName() + " " + member2.getLastName() + " no of members: "
                + member2.getNoOfMembers());

        Members member3 = new Members("Scarlett", "Johansson");
        System.out.println(member3.getFirstName() + " " + member3.getLastName() + " no of members: "
                + member3.getNoOfMembers());

        System.out.println(member1.getFirstName() + " " + member1.getLastName() + " no of members: "
                + member1.getNoOfMembers());
    }
}