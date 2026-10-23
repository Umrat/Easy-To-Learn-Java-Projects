package Unit2;

public class FizzBuzz_TwoPlayer
{
    public static void main (String args[])
    {
        new FizzBuzz_TwoPlayer ();
    }


    /* Your task:
	  Fill in the methods below, not the constructor, so the code runs properly.
	  It should create a two-player Fizz-Buzz game.

	  Sample game play:
	    Human>> 1
	    CPU>>   2
	    Human>> Buzz
	    CPU>>   Fizz
	    CPU, that's wrong! It's 4
	    The human wins!

	    Play again? (y/n)>> y

	    Human>> 1
	    CPU>>   2
	    Human>> Buzz
	    CPU>>   4
	    Human>> Fizz
	    CPU>>   Buzz
	    Human>> 89
	    Human, that's wrong! It's 7
	    The CPU wins!

	    Play again? (y/n)>> n
	   */

    public FizzBuzz_TwoPlayer ()
    {
        rules ();
        char again = 'y';
        while (again != 'n')
        {
            System.out.println ();
            int turn = 1;
            boolean done = false;
            int n = 1;
            while (!done)
            {
                if (turn == 1)
                {
                    done = humanTurn (n);
                    turn = 2;
                }
                else
                {
                    done = cpuTurn (n);
                    turn = 1;
                }
                n++;
            }
            again = IO.inputChar ("\nPlay again? (y/n)>> ");
        }
    }


    public void rules ()
    { System.out.println("Welcome");
        System.out.println("Fizz Buzz is a counting game where you count from 1 up to a given number, but there are a few extra rules.\n" +
                "Instead of saying numbers divisible by 3, you say \"Fizz\", and instead of saying numbers divisible by 5, you say \"Buzz\". For numbers divisible by both 3 and 5, you say \"Fizz-Buzz\".\n" +
                "Example: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, 9, Buzz, etc.");
    }


    public String fBNum (int n) {
        if (n % 15 == 0)
            return "FizzBuzz";

        else if (n % 3 == 0)
            return "Fizz";

        else if (n % 5 == 0)
            return "Buzz";
    else
        return "" + n;
    //Returns the nth Fizz-Buzz number,
    //Which will be Fizz, Buzz, Fizz-Buzz, or n itself
    //Needs an if-statement, but no loop

    }


    public boolean humanTurn (int n)
    { //n is the current number

        //Gets the right Fizz-Buzz number (done)
        String right = fBNum (n);

        //Gets the user's Fizz-Buzz number (done)
        String ans = IO.inputString ("Human>> ");

        //If the user's answer is right, return false (the game is NOT over)
    if (ans.equals(right))
        return false;
    else
        System.out.println("Dumbahh");
        System.out.println("It Was " + n);
        System.out.println("Clanker Beat U");
        System.out.println("Game Over");
        return true;
    }



    public boolean cpuTurn (int n) { //n is the current number

        String right = fBNum(n);
        //Want the CPU to get it wrong occasionally
        int prob = (int) (Math.random() * 5) + 1;

        //If the random number is 2, the CPU gets it wrong:
        if (prob == 2) {
            System.out.println("Clanker Wrong");
            System.out.println("It Was " + n);
            System.out.println("Human Wins");
            System.out.println("Game Over");
            return true;
        }
        else {
            String cpu_guess = right;
            System.out.println("CPU>>   " + right);
            return false;
        }
        // 1. Tell them the CPU was wrong

        // 2. Tell them the right Fizz-Buzz number

        // 3. Tell the human they won

        // 4. Return true (the game IS over)


        //Otherwise, the CPU gets it right:

        // 1. Make the CPU guess the Fizz-Buzz number (right one)


        // 2. Return false (the game is NOT over)


    }
}