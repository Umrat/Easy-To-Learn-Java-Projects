import java.util.Locale;

public class quad {
    public static void main(String[] args) {
        new quad();
    }

    public quad() {
        int x = IO.inputInt("What Is The X Value ");
        int y = IO.inputInt("What Is The Y Value ");
        String point = ("(" + x + "," + y + ")");
        if (x == 0 && y == 0)
            System.out.println("The " + point + " Is On The Origin");
        else if (x >= 0 && y >= 0)
            System.out.println("The " + point + " Is In Q1");
        else if (x <= 0 && y == 0)
            System.out.println("The " + point + " Is In Q2");
        else if (x <= 0 && y <= 0)
            System.out.println("The " + point + " Is In Q3");
        else
        System.out.println("The " + point + " Is In Q4");
        if (x==0)
            System.out.println("The " + point + " Is On The Y Axis");
        if (y==0)
            System.out.println("The " + point + " Is On The X Axis");
    }
}
