package Unit2;

import Unit1.IO;

public class sped {
    public static void main(String[] args) {
        new sped();
    }

    public sped() {

            char cont = 'y';
            while (cont == 'y') {

                int limit = IO.inputInt("What Is The Speed Limit ");
                int speed = IO.inputInt("What Is The Speed Of Your Car ");

                if (speed < limit) {
                    System.out.println("Congratulations, You Are Within The Speed Limit");
                }
                cont = IO.inputChar("Continue y/n ");

            }
        }
    }


