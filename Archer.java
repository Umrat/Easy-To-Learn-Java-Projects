public class Archer {
    public static void main(String[] args) {
        new Archer();
    }

    public Archer() {

        System.out.println("***** Welcome To My Farm *****");
        double Rice = IO.inputDouble("Enter kg of Rice : ");
        double Honey = IO.inputDouble("Enter amt of Honey : ");
        int archer = IO.inputInt("Enter how many Archers Max(1) : ");
        double pigs = IO.inputDouble("Enter The amt Pigs : ");
        double poutine = IO.inputDouble("Enter The amt of Poutines : ");
        System.out.println("\n****************");
        System.out.println("*     Bill     *");
        System.out.println("****************\n");
        System.out.println(archer + "  Archer is  $50,000,000\t =$" + (500000000*archer) );
        System.out.println(Honey + "  Honey is  $5 each\t =$" + (5*Honey) );
        System.out.println(Rice + "  Rice is  $5 per kg\t =$" + (5*Rice) );
        System.out.println(pigs + "  Pigs are  $1600 each\t =$" + (1600*pigs) );
        System.out.println(poutine + "  Poutine is $6 each\t =$" + (6*poutine) );
    }
}
























