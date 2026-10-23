package Unit2;

public class ReadingChallenge {
    public static void main(String args[]) {
        new ReadingChallenge();
    }

    public ReadingChallenge() {
        showWelcome();
        int people = getParticipantCount();

        System.out.println("");
        int total = 0;
        for(int a = people;a>0;a--){
            String name = IO.inputString("What Is Your Name? ");
            int amt = getBooksRead();
            int points = calculatePoints(amt);
            displayResult(name,amt,points);

         total +=points;
            System.out.println("");
        }
        System.out.println("Group Total Points : " + total);
    }

    public int getParticipantCount(){
        int participant = IO.inputInt ("How Many Participants? ");
        while (participant <= 1) {
            System.out.println("Participants Have To Be Greater Than 1 ");
            participant = IO.inputInt("How Many Participants? ");
        }
        return participant;
    }


        public int getBooksRead() {
            int books = IO.inputInt("How Many Books Did You Read? ");
            return books;
        }

    public void showWelcome() {
        System.out.println("Welcome To The Reading Challenge!");
        System.out.println("Earn 3 Points Per Book And 10 Bonus Points For Reading 5 Or More Books");
    }
    public void displayResult(String name, int amt, int points) {

        System.out.println(name + ": " + amt + " books, " + points + " points");
    }

    public int calculatePoints(int amount) {
        int points = (amount * 3);
        if (amount>=5){
            points+=10;
        }
        return points;
    }
}
