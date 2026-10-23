public class Egg {
    public static void main(String[] args) {
        new Egg();
    }

    public Egg() {

        int Rice = IO.inputInt("Enter amount of Archer's Eggs: ");
        int Crate = Rice/180;
        Rice = Rice%180;
        int Carton = Rice/12;
        int left = Rice%12;




        System.out.println("That is " + Crate + " crate(s), " + Carton + " carton(s), and " + Rice + " egg(s)");

    }
}

