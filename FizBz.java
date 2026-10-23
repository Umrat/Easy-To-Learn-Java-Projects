package Unit2;

import Unit1.IO;

public class FizBz {
    public static void main(String[] args) {
        new FizBz();
    }

    public FizBz() {
        int lastNum = IO.inputInt("What Is The End Value ");
        for (int i = 1; i <= lastNum; i++) {

            if (i % 15 == 0)
            System.out.println("Fizz-Buzz");

            else if (i%3==0)
            System.out.println("Fizz");

            else if (i%5==0)
            System.out.println("Buzz");

            else
            System.out.println(i);
        }
    }
}
