public class Assessement {
    public static void main(String[] args) {
        new Assessement();
    }

    public Assessement() {
        String place = IO.inputString("Enter Your Destination : ");
        System.out.println("***** The " + place +  " Trip Information Waiver *****");
        int ppl = IO.inputInt("How Many Students Are Attending ");
        double cost = IO.inputInt("How Much Will The Trip Cost Per Student ");
        double food = IO.inputInt("How Much Will The Lunch Cost Per Student ");
        int bus = IO.inputInt("How Many Students Can Fit Per Bus ");
        double ttlcost = cost*ppl;
        double ttlfood = food*ppl;
        double ttl = ttlfood+ttlcost;
        int buses = ppl/bus;
        int left = ppl%bus;
        String formattedttlcost = String.format("%.2f",ttlcost);
        String formattedttlfood = String.format("%.2f",ttlfood);
        String formattedttl = String.format("%.2f",ttl);
        System.out.println("\n***************************");
        System.out.println("*     "+ place + " Summary     *");
        System.out.println("***************************\n");
        System.out.println("The Total Trip Cost Is $" + formattedttlcost);
        System.out.println("The Total Cost Of Food For All Students Is $" + formattedttlfood );
        System.out.println("Total Cost Is $" +  formattedttl );
        System.out.println("Buse(s) Needed " + buses );
        System.out.println("Students Leftover " + left );
    }
}

