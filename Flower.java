public class Flower {
    public static void main(String[] args) {
        new Flower();
    }

    public Flower() {

        int pots = IO.inputInt("Enter amount of Flower Pot's: ");
        int Large = pots/9;
        pots = pots%9;
        int Medium = pots/4;
        pots = pots%4;
        int small = pots;

        System.out.println("That is " + Large + " large boxes, " + Medium + " medium boxes, and " + small + " small boxes");
        int total = small + Medium + Large;
        System.out.println("The Total Boxes is " + total);
    }
}
