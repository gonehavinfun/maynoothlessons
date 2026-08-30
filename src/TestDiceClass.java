/*
*Create and interact with two Dice Objects
*Using both the default constructor and constructor
*
*/

public class TestDiceClass
{
    public static void main(String[] args)
    {
        //create new dice using the default constructor
        Dice d1 = new Dice();

        //get the number of sides on d1
        int d1Sides = d1.getNoOfSides();
        System.out.println("The number of sides on d1 is " + d1Sides);

        //change the number of sides on d1
        d1.setNoOfSides(9);
        d1Sides = d1.getNoOfSides();
        System.out.println("The new number of sides on d1 is " + d1Sides);

        //create another new dice this time using constructor
        Dice d2 = new Dice(15);
        System.out.println("The number of sides on d2 is " + d2.getNoOfSides());

        //roll d1
        int d1Roll = d1.rollDice();
        System.out.println("d1 has rolled a " + d1Roll);

        //roll d2
        int d2Roll = d2.rollDice();
        System.out.println("d2 has rolled a " + d2Roll);
    }
}