package Unit2;

public class Series {
    public static void main(String[] args) {
        new Series();
    }

    public Series() {

        for (int i = 0; i < 26; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 5; i < 21; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 30; i < 51; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 12; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 100; i > 84; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 2; i < 27; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 5; i < 75; i+=5) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}