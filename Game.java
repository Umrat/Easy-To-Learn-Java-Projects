package Unit3;
import java.util.Timer;
import java.util.TimerTask;
/*
Game : Break In The House
Author: Umrat
Date: October 25th 2026
Purpose: Break Into The House And Escape
 */
public class Game {
    // Sets All Values That Will Be Reused Between Challenges
    Timer timer = new Timer();
    int HP = 100;
    int EHP = 230;
    int points = 0;
    String path = "";
    String name = IO.inputString("Name : ");
    String bossname = "";
    public static void main(String[] args) {
        new Game();

    }
    public Game() {

        rungame();
    }
    // Controls the overall sequence of the game
    public void rungame() {
        introduction();
        challengeOne();
        bossfight(challengeThree(challengeTwo()));
        // Controls If You Proceed To Secret Ending Or The Natural One
        if( bossname.equals("\uD835\uDC68\uD835\uDC93\uD835\uDC84\uD835\uDC89\uD835\uDC86\uD835\uDC93(Ｍｕｔａｔｅｄ)")){
        runsecretgame();
        }
        else {
            quiz();
        }
    }
    // Introduces The Game And Pressing Enter To Continue Mechanic
    public void introduction() {
        System.out.print("TV ANCHOR : A Biological Weapon Has Been Released As A Test Into Your Town ");
        System.out.println();
        System.out.println("EVACUATE NOW");
        System.out.println();
        String answer = IO.inputString(name + "'s Brain : Now's A Good Time To Rob Some Building Right? (yes/no) ");
        while (!answer.equals("yes") && !answer.equals("YES")&&!answer.equals("Yes")&&!answer.equals("no")&&!answer.equals("NO")&&!answer.equals("nah")&&!answer.equals("n")&&!answer.equals("hell nah")&&!answer.equals("nah man")&&!answer.equals("nope")&&!answer.equals("naurr")&&!answer.equals("noo")&&!answer.equals("naur")&&!answer.equals("no sirry")) {
            System.out.println("Invalid");
            answer = IO.inputString("(yes/no) ");
        }

        if (answer.equals("yes") || answer.equals("YES") || answer.equals("Yes")) {
            System.out.println("Press Enter To Continue Story");
            System.out.print("Travelling...");
            for(int i=0;i<=2;i++) {
                IO.inputString("");
                System.out.print("...");
            }

            System.out.println("");
            System.out.println("");
        } else {
            conclusion();

        }
    }
    // Rolls Dice On The Route You Are Able To Enter The House To Consider Randomaly Wether You Will Be Able To Enter INto THe House Or Not
    public void challengeOne() {
        System.out.println("Whilst The City Is In Chaos You Find A Abandoned Mansion Left By Its Millionaire Owner");
        System.out.println("Which Way Will You Try To Enter With?");
        System.out.println("The More Risky, The More Points You Shall Obtain");
        String entry = IO.inputString("Front Door, Back Yard, Window, Basement ");
        while (!entry.equals("Front Door") && !entry.equals("front door")&& !entry.equals("front")&&!entry.equals("Front")&&!entry.equals("Back")&&!entry.equals("back")&&!entry.equals("back yard")&&!entry.equals("Back yard")&&!entry.equals("BACK")&&!entry.equals("window")&&!entry.equals("Window")&&!entry.equals("Base")&&!entry.equals("base")&&!entry.equals("basement")&&!entry.equals("Basement")) {
            System.out.println("Invalid");
            entry = IO.inputString("Front Door, Back Yard, Window, Basement ");
        }
        
        if (entry.equals("Front Door") || entry.equals("front door") || entry.equals("front") || entry.equals("Front")) {
            path = "front";
            if ((rollD6(3) == true)) {
                System.out.println("Successful You're In");
            } else {
                System.out.println("Unsuccessful There Was Security");
                HP = 0;
                conclusion();
            }
        } else if (entry.equals("Back yard") || entry.equals("back yard") || entry.equals("back") || entry.equals("Back")) {
            path = "back";
            if ((rollD6(2) == true)) {
                System.out.println("Successful You Got Into The Mansion");
            } else {
                System.out.println("Unsuccessful There Was Dogs");
                HP = 0;
                conclusion();
            }
        } else if (entry.equals("Window") || entry.equals("window")) {
            path = "window";
            if ((rollD6(5) == true)) {
                System.out.println("Successful You're In");
            } else {
                System.out.println("Unsuccessful You Couldn't Break The Glass And Fell Eight Stories");
                HP = 0;
                conclusion();
            }
        } else if (entry.equals("Basement") || entry.equals("Base") || entry.equals("base") || entry.equals("basement")) {
            path = "base";
            if ((rollD6(0) == true)) {
                System.out.println("Successful You're Inside");
            } else {
                System.out.println("Unsuccessful");
                HP = 0;
                conclusion();
            }
        } else {
            HP = 0;
            conclusion();
        }
        // Add the first challenge
    }
    // The More Risky The More Points Obtained From Your Route
    public boolean challengeTwo() {
        if (path.equals("base")) {
            points += 20;
            IO.inputString("");
            System.out.println("You Arrive To The Basement ");
        } else if (path.equals("front")) {
            points += 50;
            IO.inputString("");
            System.out.println("You Get Into The Mansion What Now?");

        } else if (path.equals("window")) {
            points += 200;
            IO.inputString("");
            System.out.println("You Enter A Lavish Room What Now ");

        } else if (path.equals("back")) {
            points += 35;
            IO.inputString("");
            System.out.println("You Got In Through The Back");
        }
        else {

        }
        String Reply = answerstoptionssimplified();
        return options(Reply);
    }
    // Concludes The Story Or Runs The Secret Game
    public void conclusion() {
        if( bossname.equals("\uD835\uDC68\uD835\uDC93\uD835\uDC84\uD835\uDC89\uD835\uDC86\uD835\uDC93(Ｍｕｔａｔｅｄ)")&&(HP>0)){
            runsecretgame();
        }
        else {
            System.out.println("");
            points();
            conclusionHP();
            System.out.println("The Adventure Is Over For Now");
            String out = IO.inputString("Will You Rob Again? (yes/no) ");
            while (!out.equals("yes") && !out.equals("YES") && !out.equals("front") && !out.equals("Yes") && !out.equals("no") && !out.equals("NO") && !out.equals("nah") && !out.equals("n") && !out.equals("hell nah") && !out.equals("nah man") && !out.equals("nope") && !out.equals("naurr") && !out.equals("noo") && !out.equals("naur") && !out.equals("no sirry")) {
                System.out.println("Invalid");
                out = IO.inputString("(yes/no) ");
            }
            if (out.equals("yes") || out.equals("Yes")) {
                reset();
            }
            else {
                System.exit(0);
            }
        }
    }
    // Chooses Which Boss You End Up With
    public boolean challengeThree(boolean cross) {
        if (cross == true) {
            System.out.println("\nYou Hear Knocking At The Door");
            String knockreply = IO.inputString("Do You Check It Out? ");
            System.out.println("");
            while (!knockreply.equals("yes") && !knockreply.equals("YES")&& !knockreply.equals("front")&&!knockreply.equals("Yes")&&!knockreply.equals("no")&&!knockreply.equals("NO")&&!knockreply.equals("nah")&&!knockreply.equals("n")&&!knockreply.equals("hell nah")&&!knockreply.equals("nah man")&&!knockreply.equals("nope")&&!knockreply.equals("naurr")&&!knockreply.equals("noo")&&!knockreply.equals("naur")&&!knockreply.equals("no sirry")) {
                System.out.println("Invalid");
                knockreply = IO.inputString("(yes/no) ");
            }
            if (knockreply.equals("yes") || knockreply.equals("Yes")) {
                return false;
            }
            else {
               String storechoice = answerstoptionssimplified();
                boolean bossbattler = (options(storechoice));
                return bossbattler;
            }
        }
        else if (cross == false) {
            return false;
        }
        return false;
    }
    // Runs The Code Based Off Which Of The Three Options You Selected
    public boolean options(String Choice) {
        if (Choice.equals("Rob") || Choice.equals("rob")||Choice.equals("ROB")) {
            if (path.equals("base")) {
                if (rollD6(2) == true) {
                    points += 50;
                    IO.inputString("Found A Hammer");
                    return false;
                }
                else {
                    points += 10;
                    System.out.println("You Found A Trashbag...");
                    return false;
                }
            }
            else if (path.equals("front")) {
                if (rollD6(3) == true) {
                    points += 150;
                    IO.inputString("Found A Expensive Door Handle");
                    return false;
                }
                else {
                    points += 10;
                    System.out.println("You Found A Trashbag...");
                    return false;
                }
            }
            else if (path.equals("window")) {
                if (rollD6(5) == true) {
                    points += 1800;
                    IO.inputString("you found a ROLLIE(LEGENDARY)");
                    return false;
                }
                else {
                    points += 10;
                    System.out.println("You Found A Trashbag...");
                    return false;
                }
            }
            else if (path.equals("back")) {
                if (rollD6(2) == true) {
                    points += 50;
                    IO.inputString("Found A Hammer");
                    return false;
                }
                else {
                    points += 10;
                    System.out.println("You Found A Trashbag...");
                    return false;
                }
            }
            return false;
        }
        else if (Choice.equals("Explore") || Choice.equals("explore")|| Choice.equals("EXPLORE")) {
            return true;
        }
        else {
            System.out.println("Scaredy Cat ");
            System.exit(0);
            return true;
        }
    }
    // Resets Fields And Allows Game To Repeat
    public void reset() {
        timer = new Timer();
        points = 0;
        path = "";
        HP = 100;
        EHP = 230;
        System.out.println("");
        rungame();
    }
    // Rolls A Dice, True Or False If You Roll Above A Certain Value
    public boolean rollD6(int odds) {
        double randomiz = (Math.random() * 6);
        if (randomiz > odds) {
            return true;
        }
        else {
            return false;
        }
    }
    // Prints Out Your End Game Points
    public void points() {

        System.out.println("Congrats You Ended With A Total Of " + points + " points");
    }
    // End Game Health Points
    public void conclusionHP() {

        System.out.println("You Ended With " + HP + " Health Points Left");
    }
    // Bossfight
    public void bossfight(boolean boss) {
        // Chooses Your Bossfight Name
        if (boss == true) {
            IO.inputString("A Mutated Millionaire Monster Man Breaks Down The Door(For Reference Search Up T-001)");
            bossname = "\uD835\uDC68\uD835\uDC93\uD835\uDC84\uD835\uDC89\uD835\uDC86\uD835\uDC93(Ｍｕｔａｔｅｄ)";
        }
        else {
            IO.inputString("Gangster Leo De La Favela Comes To Take Your Spoils");
            bossname = "Ｌｅｏ　Ｄé　Ｌａ　Ｆａｖｅｌａ";
        }
        System.out.println("Time To FIGHT!!!");
// Loops Fight Until It's Over
        while (EHP > 0 && HP > 0) {
            System.out.println("—————————————————————————————————————");
            health(bossname, name);
            System.out.println("");
            System.out.println("A) Drop Kick");
            System.out.println("B) Jump 580° Tornado Shift Side Kick");
            System.out.println("C) 580° Slide Axe Kick");
            System.out.println("D) Spin Back Kick");
            char atk = IO.inputChar("Attack Choice (A, B, C, or D)\n");
            while (atk != 'A' && atk != 'B' && atk != 'C' && atk != 'D' && atk != 'a' && atk != 'b' && atk != 'c' && atk != 'd'&& atk != 'L'&& atk != 'l') {
                System.out.println("Invalid Input");
                atk = IO.inputChar("Attack Choice (A, B, C, or D)");
            }
            System.out.println("");
            attack(atk);
        }
        if (HP > 0) {
            System.out.println("");
            System.out.println("WIN!");
            points+=150;
        } else if (HP < 0 && EHP < 0) {
            System.out.println("");
            System.out.println("Tie (- _ -)");
            conclusion();
        } else {
            System.out.println("");
            System.out.println("Loser :(");
conclusion();
        }
    }
    //Trivia Questions
    public void quiz() {
        System.out.println("—————————————————————————————————————");
        System.out.println("You Now Find Yourself Needing To Answer 3 Questions To Leave The House ");
        System.out.println("There's A Virus Detonation Rigged In The Next 15 Seconds It Will Deactivate The Source Code Of Your World");
        System.out.println("Unless You Finish These Three Questions");
        timer.schedule(new Task(), 15000);
        riddle("How Many Elements On The Periodic Table? ","118");
        points+=40;

        riddle("What's Archer's Full Name? ","Archer JL Kim");
        points+=30;
        riddle("Where Is Leo From? ","La Favelas");
        points+=20;
        timer.cancel();
        System.out.println("You Escaped!");
        conclusion();
    }
    // Characters HP and Enemy HP
    public void health(String n1, String n2) {
        System.out.println(n1 + "'s HP : " + EHP);
        System.out.println(n2 + "'s HP : " + HP);
    }
    // Imagines Each Scenario Based On Attack And Tests If You Land Your Move
    public void attack(char attackchoice) {
        if (attackchoice == 'A' || attackchoice == 'a') {
            if (rollD6(1) == true) {
                System.out.println("You Hit Him For 30 Dmg");
                EHP -= 30;
                if (rollD6(1) == true) {
                    System.out.println("He Punches You For 10 Dmg");
                    HP -= 10;
                }
                else {
                    System.out.println("He Missed");
                }
            }
            else {
                System.out.println("You Missed");
                if (rollD6(1) == true) {
                    System.out.println("He Calls The Cartel On You For 10 Dmg");
                    HP -= 10;
                }
                else {
                    System.out.println("He Missed");
                }
            }
        }
        else if (attackchoice == 'b' || attackchoice == 'B') {
            if (rollD6(5) == true) {
                System.out.println("You Hit Him For 90 Dmg");
                EHP -= 90;
                if (rollD6(1) == true) {
                    System.out.println("He Chokes You Out With Chopsticks For 10 Dmg");
                    HP -= 10;
                }
                else {
                    System.out.println("He Missed");
                }
            }
            else {
                System.out.println("You Fell Mid Spin");
                if (rollD6(1) == true) {
                    System.out.println("He Hit You With Capoeira Kick For 10 Dmg");
                    HP -= 10;
                }
                else {
                    System.out.println("He Missed");
                }
            }
        }
        else if (attackchoice == 'C' || attackchoice == 'c') {
            if (rollD6(3) == true) {
                System.out.println("You Hit Him For 60 Dmg");
                EHP -= 60;
                if (rollD6(1) == true) {
                    System.out.println("He Hits You With Olivia Rodrigo For 10 Dmg");
                    HP -= 10;
                }
                else {
                    System.out.println("He Missed");
                }
            }
            else {
                System.out.println("You Slipped And Fell");
                if (rollD6(1) == true) {
                    System.out.println("He Walks All Over You With Natalie Jinji  For 10 Dmg");
                    HP -= 10;
                }
                else {
                    System.out.println("He Missed");
                }
            }
        }
        else if (attackchoice == 'D' || attackchoice == 'd') {
            if (rollD6(2) == true) {
                System.out.println("You Hit Him For 45 Dmg");
                EHP -= 45;
                if (rollD6(1) == true) {
                    System.out.println("He Whips You With His Wired Earpods For 10 Dmg");
                    HP -= 10;
                }
                else {
                    System.out.println("He Missed");
                }
            }
        }
        else if (attackchoice == 'L' || attackchoice == 'l') {
            System.out.println("You Chudded");
            EHP -= 220;
        }
             else {
                System.out.println("You Got Dizzy And Missed");
                if (rollD6(1) == true) {
                    System.out.println("He Hit You Flying Brazilian Arm Bar For 10 Dmg");
                    HP -= 10;
                } else {

                    System.out.println("He Missed");
                }
            }
        }
    // Runs Your Question And Takes Your Answer Then Checks If It's Correct
    public void riddle(String question, String Answer) {
        String riddle = IO.inputString(question + "\n");
        if (riddle.equals(Answer)) {
            System.out.println("Correct!");
        }
        else {
            if(!Answer.equals("yes") && !Answer.equals("YES")&&!Answer.equals("Yes")&&!Answer.equals("no")&&!Answer.equals("NO")&&!Answer.equals("nah")&&!Answer.equals("n")&&!Answer.equals("hell nah")&&!Answer.equals("nah man")&&!Answer.equals("nope")&&!Answer.equals("naurr")&&!Answer.equals("noo")&&!Answer.equals("naur")&&!Answer.equals("no sirry")){
                timer.cancel();
                System.out.println("Nah Dumahh");
                conclusion();
            }
            else{

                System.out.println("");
            }

        }
    }
    // Checks If THe Option You Picked Was Invalid Until You Pick A Valid Answer
    public String answerstoptionssimplified(){
        String option2 = IO.inputString("Rob, Explore, Or Turn Back ");
        while (!option2.equals("Rob") && !option2.equals("rob")&& !option2.equals("ROB")&&!option2.equals("Explore")&&!option2.equals("explore")&&!option2.equals("EXPLORE")&&!option2.equals("Back")&&!option2.equals("back")&&!option2.equals("BACK")&&!option2.equals("Turn Back")&&!option2.equals("turn back")&&!option2.equals("TURN BACK")) {
            System.out.println("Invalid");
            option2 = IO.inputString("Rob, Explore, Or Turn Back ");
        }
        return option2;
    }
    // Explodes The Bomb Once Timer Has Finished
         class Task extends TimerTask {
            @Override
            public void run() {
                System.out.println("");
                System.out.println("Boom Boom Boom Bomb Exploded!");
                System.exit(5);
            }

    }
    // Introduces The Secret Challenge
    public String secretintro() {
        System.out.println("Now That You've Beaten The Owner You Find A Key On Him And Enter His Locked Room");
        System.out.println("You Enter And Find A Big Red Button With A Note That Says \"DON'T PRESS\"");
        return IO.inputString("Do You Press The Button? ");
    }
    public String secretchallenge1() {
        System.out.println("");
        System.out.println("An Alarm Blares What Do You Do?");

        IO.inputString("A) Press The Button Again");
        IO.inputString("B) Look Around The Desk");
        IO.inputString("C) Run Away");
        IO.inputString("D) Break The Button With Your Fist");
        String secretchoice = IO.inputString("Choice? (A,B,C,D) ");
        while (!secretchoice.equals("A") && !secretchoice.equals("B") && !secretchoice.equals("C") && !secretchoice.equals("D") && !secretchoice.equals("a") && !secretchoice.equals("b") && !secretchoice.equals("c") && !secretchoice.equals("d")) {
            System.out.println("Invalid Input");
            secretchoice = IO.inputString(" (A, B, C, or D) ");
        }
        System.out.print("...");
        IO.inputString("");
        System.out.print("...");
        return secretchoice;
    }
    // Ask You Wether You Play A Secret Game
    public void runsecretgame(){
        String answer = secretintro();
        while (!answer.equals("yes") && !answer.equals("YES")&&!answer.equals("Yes")&&!answer.equals("no")&&!answer.equals("NO")&&!answer.equals("nah")&&!answer.equals("n")&&!answer.equals("hell nah")&&!answer.equals("nah man")&&!answer.equals("nope")&&!answer.equals("naurr")&&!answer.equals("noo")&&!answer.equals("naur")&&!answer.equals("no sirry")) {
            System.out.println("Invalid");
            answer = IO.inputString("(yes/no) ");
        }
        if (answer.equals("yes") || answer.equals("YES") || answer.equals("Yes")) {
            String secretpick = secretchallenge1();
            System.out.println("");
            if((secretpick.equals("A")||secretpick.equals("a"))){
                secretconclusion3();
            }
            else if((secretpick.equals("B")||secretpick.equals("b"))){
                secretconclusion4();
            }
            else if ((secretpick.equals("D")||secretpick.equals("d"))){
                secretconclusion2();
            }
            else if ((secretpick.equals("C")||secretpick.equals("c"))) {
                secretconclusion1();
            }
        }
        else {
            secretconclusion1();
        }
    }
    // Endings Are Below
    public void secretconclusion1() {
        System.out.println("");
        System.out.println("You Leave The House Feeling Fulfilled With Your Break-In");
        System.out.println("Then You Get Torn Apart By A Mutated Samer And Die");
            System.out.println("");
            String out = IO.inputString("Will You Try The Secret Again?(3 Endings) (yes/no) ");
            while (!out.equals("yes") && !out.equals("YES") && !out.equals("Yes") && !out.equals("no") && !out.equals("NO") && !out.equals("nah") && !out.equals("n") && !out.equals("hell nah") && !out.equals("nah man") && !out.equals("nope") && !out.equals("naurr") && !out.equals("noo") && !out.equals("naur") && !out.equals("no sirry")) {
                System.out.println("Invalid");
                out = IO.inputString("(yes/no) ");
            }
            if (out.equals("yes") || out.equals("Yes")|| out.equals("YES")) {
                runsecretgame();
            }
            else {
                System.exit(0);
            }
        }
    public void secretconclusion2() {
        System.out.println("");
        System.out.println("A Grotesque Goo Monster Leaks Out Of The Button");
        System.out.println("Robodomi Attempts To Fight You");
        EHP = 500;
        HP = 110;
        System.out.println("");
        System.out.println("Time To FIGHT!!!");
        bossname = "RoboMommy AKA Robodomi, AKA Dominik Kovacs";
        while (EHP > 0 && HP > 0) {
            System.out.println("—————————————————————————————————————");
            health(bossname, name);
            System.out.println("");
            System.out.println("A) Drop Kick");
            System.out.println("B) Jump 580° Tornado Shift Side Kick");
            System.out.println("C) 580° Slide Axe Kick");
            System.out.println("D) Spin Back Kick");
            char atk = IO.inputChar("Attack Choice (A, B, C, or D)\n");
            while (atk != 'A' && atk != 'B' && atk != 'C' && atk != 'D' && atk != 'a' && atk != 'b' && atk != 'c' && atk != 'd'&& atk != 'L'&& atk != 'l') {
                System.out.println("Invalid Input");
                atk = IO.inputChar("Attack Choice (A, B, C, or D)\n");
            }
            System.out.println("");
            attack(atk);
        }
        if (HP > 0) {
            System.out.println("");
            System.out.println("You Barely Beat Him Now He's Became A Part Of You ");
            System.out.println("You Retain His Memories, Archer Who Was A Millionaire Bio Medical Doctor Was Experimenting\nAnd Combined A Clone Of Himself With A Thug From The Favelas\nAnd Became This Goop ");
            System.out.println("You Exit The Home And Go On A Mass Murder Spree With Your New Goop Powers");
            points += 1000;
                    conclusion();
        }
        else if (HP < 0 && EHP < 0) {
            System.out.println("");
            System.out.println("Tie (- _ -)");
            conclusion();
        }
        else {
            System.out.println("");
            System.out.println("Loser :(");
            conclusion();
        }

    }
    public void secretconclusion3() {
        System.out.println("");
        System.out.print("You Press The Button Again");
        IO.inputString("");
        System.out.print("It Activates A City Wide Cleaner Nuke");
        IO.inputString("");
        System.out.print("It Nukes Everything Except The Room Around You");
        IO.inputString("");
        System.out.print("You Exit And Find A Wasteland");
        IO.inputString("");
        System.out.print("CANON ENDING : PART 2 SOON(MAYBE NEVER)");
        IO.inputString("");
        System.out.println("");
        System.out.println("              CREDITS             ");
        System.out.println("—————————————————————————————————————");
        System.out.println("Creator : Umrat");
        System.out.println("Coder : Umrat");
        System.out.println("Game Designer : Umrat");
        System.out.println("Idea Came From : Umrat");
        System.out.println("CEO : Umrat");
        System.out.println("CFO : Umrat");
        System.out.println("CTO : Umrat");
        System.out.println("FBI : Umrat");
        System.out.println("Chancellor : Archer");
        System.out.println("");
        String out = IO.inputString("Will You Try The Secret Again?(3 Endings) (yes/no) ");
        while (!out.equals("yes") && !out.equals("YES") && !out.equals("Yes") && !out.equals("no") && !out.equals("NO") && !out.equals("nah") && !out.equals("n") && !out.equals("hell nah") && !out.equals("nah man") && !out.equals("nope") && !out.equals("naurr") && !out.equals("noo") && !out.equals("naur") && !out.equals("no sirry")) {
            System.out.println("Invalid");
            out = IO.inputString("(yes/no) ");
        }
        if (out.equals("yes") || out.equals("Yes")|| out.equals("YES")) {
            runsecretgame();
        }
        else {
            System.exit(0);
        }
    }
    public void secretconclusion4(){
        System.out.println("");
        System.out.println("You Find A Hammer");
        System.out.println("Do You?");
        IO.inputString("A) Eat It");
        IO.inputString("B) Break The Button");
        String hammerchoice = IO.inputString("Choice? (A,B) ");
        while (!hammerchoice.equals("A") && !hammerchoice.equals("B")&& !hammerchoice.equals("a") && !hammerchoice.equals("b")) {
            System.out.println("Invalid Input");
            hammerchoice = IO.inputString(" (A, B) ");
        }
        if(hammerchoice.equals("A")||hammerchoice.equals("a")){
            System.out.println("You Die Like A Dumbass");
            String out = IO.inputString("Will You Try The Secret Again?(3 Endings) (yes/no) ");
            while (!out.equals("yes") && !out.equals("YES") && !out.equals("Yes") && !out.equals("no") && !out.equals("NO") && !out.equals("nah") && !out.equals("n") && !out.equals("hell nah") && !out.equals("nah man") && !out.equals("nope") && !out.equals("naurr") && !out.equals("noo") && !out.equals("naur") && !out.equals("no sirry")) {
                System.out.println("Invalid");
                out = IO.inputString("(yes/no) ");
            }
            if (out.equals("yes") || out.equals("Yes")|| out.equals("YES")) {
                runsecretgame();
            }
            else {
                System.exit(0);
            }
        }
        else {
            secretconclusion2();
        }
    }
}


