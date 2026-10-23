public class QuestionAnswer {

    public static void main (String arg[])
    {
        new QuestionAnswer ();
    }

    public QuestionAnswer ()
    {
        String name = IO.inputString("what is your name\n" );
        System.out.println("Your Answer:" + name);
        String lstname = IO.inputString("what is your last name?\n");
        System.out.println("Your Answer:" + lstname);
        String age = IO.inputString("what is your age?\n");
        System.out.println("Your Answer:" + age);
        String pstlcde = IO.inputString("what is your postal code?\n");
        System.out.println("Your Answer:" + pstlcde);
        String bthyr = IO.inputString("what is your birth year?\n");
        System.out.println("Your Answer:" + bthyr);
        String school = IO.inputString("what is your school?\n");
        System.out.println("Your Answer:" + school);

        String code = IO.inputString("Do you like computer coding?\n" );
        System.out.println("Your Answer:" + code);
        String add = IO.inputString("what is 3+4?\n");
        System.out.println("Your Answer:" + add);
        String prc = IO.inputString("What is the price of pizza in the cafeteria?\n");
        System.out.println("Your Answer:" + prc);
        String first = IO.inputString("What class do you have first period?\n");
        System.out.println("Your Answer:" + first);
        String sib = IO.inputString("How many siblings do you have?\n");
        System.out.println("Your Answer:" + sib);
        String sum = IO.inputString("What did you do this summer?\n");
        System.out.println("Your Answer:" + sum);
        String arch = IO.inputString("What is Archer?\n");
        System.out.println("Straight");


    }
}
