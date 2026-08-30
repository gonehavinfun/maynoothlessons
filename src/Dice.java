public class Dice
{
    private int noOfSides;

    //default constructor
    public Dice()
    {
        noOfSides = 6;
    }

    //constructor
    public Dice(int n)
    {
        noOfSides = n;
    }

    //getter method to return the number of sides
    public int getNoOfSides()
    {
        return noOfSides;
    }

    //setter method to set the number of sides
    public void setNoOfSides(int n)
    {
        noOfSides = n;
    }

    //method for rolling the dice
    public int rollDice()
    {
        return (int)(Math.random() * noOfSides) + 1;
    }
}