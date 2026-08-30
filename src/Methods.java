public class Methods
{
    public static void main(String [] args){
        //Create a variable and print it out
        int variable = 15;
        System.out.println("This is from the main method. The value of variable is " + variable);

        //Calling the printOut method
        printOut(variable);

        //Create a variable to hold the return from timesTwo
        int result = timesTwo(variable);
        //Print out the result
        System.out.println("This is from the main method. The value of result is " + result);
    }

    //Create a method to print out variable
    public static void printOut(int variable){
        //Print out the variable
        System.out.println("This is from the printOut Method. The value of variable is " + variable);
    }

    //Create a times two method
    public static int timesTwo(int variable){
        return variable * 2;
    }
}