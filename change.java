public class change {
    public static void main(String[] args) {
        new change();
    }

    public change() {

        int cents = IO.inputInt("Enter amount of Cent's : ");

        int Twenty = cents/2000;
        cents = cents%2000;
        int ten = cents/1000;
        cents = cents%1000;
        int Five = cents/500;
        cents = cents%500;
        int too = cents/200;
        cents = cents%200;
        int loo = cents/100;
        cents = cents%100;
        int quarters = cents/25;
        cents = cents%25;
        int dimes = cents/10;
        cents = cents%10;
        int nickels = cents/5;
        cents = cents%5;
        int pennies = cents;
        if (Twenty > 0)
            System.out.println("Twenties " + Twenty);
        if (ten > 0)
            System.out.println("Tens " + ten);
        if (Five > 0)
            System.out.println("Fives " + Five);
        if (too > 0)
            System.out.println("Toonies " + too);
        if (loo > 0)
            System.out.println("Loonies " + loo);
        if (quarters > 0)
            System.out.println("Quarters " + quarters);
        if (dimes > 0)
            System.out.println("Dimes " + dimes);
        if (nickels > 0)
            System.out.println("Nickels " + nickels);
        if (pennies > 0)
            System.out.println("Pennies " + pennies);




    }
}
