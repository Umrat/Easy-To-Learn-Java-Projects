package Unit2;

import Unit1.IO;

public class happybday {
    public static void main(String[] args) {
        new happybday();
    }

    public happybday() {
        String name = IO.inputString("What Is your name ");
        int bday = IO.inputInt("What Is your birth year ");
        int now = IO.inputInt("What is this year ");
        if (bday>=now)
            System.out.println("Invalid");
        else
        for (int i = bday; i <= now; i++) {
            System.out.println(i);
            System.out.println("Happy Birthday To You, Happy Birthday To You");
            System.out.println("Happy Birthday Dear, " + name + "Happy Birthday To You!\n");

        }
    }
}
