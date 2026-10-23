import java.util.Locale;

public class BooleanTester {
    public static void main(String[] args) {
        new BooleanTester();
    }

    public BooleanTester() {
        int ppl = IO.inputInt("What is Your Age  ");
        int cost = IO.inputInt("What Grade Are You In ");
        double food = IO.inputDouble("What is Your Average Mark ");
        String bus = IO.inputString("What Subject Are You In ");

        System.out.println("You are older than 15 " + (ppl>15));
        System.out.println("You are 18 " + (ppl==18));
        System.out.println("You aren't in twelfth grade " + (cost!=12));
        System.out.println("You have a higher average than archer or equal to " + (food>=80));
        System.out.println("You have a lower average than 50 " + (food<50));
        System.out.println("You are in comp sci " + (bus.toLowerCase(Locale.ROOT).equals("computer science")));
        System.out.println("You are atleast 16 and you're in grade 11 " + (ppl>=16 && cost==11));
        System.out.println("You have a average between 70 and 90 " + (food>70 && food<90));
        System.out.println("You are NOT in twelfth grade " + (cost!=12));
        System.out.println("You are in comp sci and have a average of atleast 80" + (((bus.toLowerCase(Locale.ROOT).equals("computer science")) && food>=80)));
        System.out.println("You are younger than 16 and has a average higher than 90" + ((ppl<16)&&food>90));
    }
}