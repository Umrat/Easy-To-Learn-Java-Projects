package Unit2;

import Unit1.IO;

public class riddle {
    public static void main(String[] args) {
        new riddle();

        int tries = 1;

        String ans = ("");
        System.out.println("Who Is Going To Toronto");
        ans = IO.inputString("");
            while (tries < 3 && !ans.equals("Augustin")) {

                System.out.println("Incorrect");
                ans = IO.inputString("");
                tries++;
            }
        if (ans.equals("Augustin")) {
            System.out.println("Good Job");
        } else {
            System.out.println("Done Bad Job");

        }
    }
}
