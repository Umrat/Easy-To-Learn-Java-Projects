package Unit2;

public class Nim
{
    public static void main (String args[])
    {
        new Nim ();
    }


    /* Fill in the methods using the comments.
       Don't touch the constructor or the turn method.
    */

    public Nim ()
    {
        char again = 'y';
        rules ();
        while (again == 'y')
        {
            int left = 15;
            int player = 2;
            String name1 = getName ("1");
            String name2 = getName ("2");

            while (left > 0)
            {
                if (player == 1)
                    player = 2;
                else
                    player = 1;
                drawLeft (left);
                whoseturn (player, name1, name2);
                left = turn (left);
            }
            whosewon (player, name1, name2);
            again = IO.inputChar ("Play again? (y/n) ");
        }
        System.out.println("\nThanks for playing the Game of Nim!");
    }


    public void rules ()
    {

    	System.out.println("Game of Nim There are 15 stones in the pile. \nPlayers take turns taking stones. On each turn, they can take one or two stones. \nThe player who takes the last stone loses.");
    }


    public String getName (String num)
    { //Asks the player for their name - e.g., Player #1: Enter your name:
        // Use the num parameter to get the player number

        // Return the name
        return  IO.inputString ("Player # "+ num + " Name : ");
    }


    public void drawLeft (int left)
    {
        //Print out a blank line to add white space
    System.out.println("");
        //Print "Stones Remaining: " and the number.
        System.out.println("Stones Remaining " + left);
        //Loop to print one star for each stone left
    for(int d= left;d>0;d--){
        System.out.print("*");
    }
    }


    public void whoseturn (int player, String name1, String name2)
    { //If player is 1, print that it is name1's turn
    if (player==1)
        System.out.println("\n" + name1 + " It Is Your Turn");
    else{
        System.out.println("\n" + name2 + " It Is Your Turn");
    }
        //Otherwise, print that it is name2's turn

    }


    public boolean isValid (int num, int left) { // Return false if num is greater than left
        if (num > left)
            return true;
        else if (num == 1 || num == 2)
            return true;
        else {
            // Return true if num is 1 or 2

            // Return false otherwise
            return true;
        }
    }

    public int turn (int left)
    {
        int amt = IO.inputInt ("\nHow many stones do you want to remove? ");
        while (!isValid (amt, left))
        {
            System.out.println ("That amount is invalid. Try a smaller number.");
            amt = IO.inputInt ("How enter stones do you want to remove? ");
        }
        return (left - amt);
    }


    public void whosewon (int player, String name1, String name2)
    { // If player is 1, then print:
        // name1 has lost. name2 forced them to take the last stone.
        if (player==1)
            System.out.println (name1 + " Lost");
        else {
            System.out.println(name2 + " Lost");
        }

        // Otherwise print a similar message about name2 losing.
    }
}