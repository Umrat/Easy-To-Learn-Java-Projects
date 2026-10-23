package Unit2;

public class beer {
    public static void main(String[] args) {
        new beer();
    }

    public beer() {

        for (int i = 100; i > 2; i--) {
            System.out.println(i + " Bottles Of Archer On The Wall");
            System.out.println(i + " Bottles Of Archer");
            System.out.println(i + " Take One Archer Pass Him Around");
            System.out.println(i-1 + " Bottles Of Archer On The Wall");
        }
        System.out.println();
        System.out.println("2 Bottles Of Archer On The Wall");
        System.out.println("2 Bottles Of Archer");
        System.out.println("Take One Archer Pass Him Around");
        System.out.println("1 Bottle Of Archer Left On The Wall");
        System.out.println("1 Bottle Of Archer On The Wall");
        System.out.println("1 Bottle Of Archer");
        System.out.println("Take It Down Pass Him Around");
        System.out.println("No More Bottles Of Archer Left On The Wall");
    }
}