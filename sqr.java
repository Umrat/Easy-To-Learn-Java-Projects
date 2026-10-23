package Unit2;

import Unit1.IO;

public class sqr {
    public static void main(String[] args) {
        new sqr();


    int dimension = Unit1.IO.inputInt("What Are The Dimensions(-1 To Quit) ");
    while (dimension > -1) {


        for (int d = dimension; d > 0; d--) {
            for (int i = dimension; i > 0; i--) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
         dimension = Unit1.IO.inputInt("What Are The Dimensions(-1 To Quit) ");

        }

    }
}
