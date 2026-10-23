public class MultChoice {
    public static void main(String[] args) {
        new MultChoice();
    }

    public MultChoice() {

        System.out.println ("Where Did Ms Warriner go this summer");
        System.out.println ("Tel Aviv");
        System.out.println ("Afghanistan");
        System.out.println ("The Afterparty");
        System.out.println ("Croatia");
        String go = IO.inputString("a, b, c, or d\n" );
        System.out.println ("You Said " + go);
        System.out.println ("It was Croatia which was (d)\n");

        System.out.println ("Where Did Umrat go this summer");
        System.out.println ("Tel Aviv");
        System.out.println ("Afghanistan");
        System.out.println ("The Octane Concert");
        System.out.println ("Croatia");
        String umrat = IO.inputString("a, b, c, or d\n" );
        System.out.println ("You Said " + umrat);
        System.out.println ("It was Octane COncert which was (c)\n");

        System.out.println ("Where Did Archer go this summer");
        System.out.println ("Tel Aviv");
        System.out.println ("Afghanistan");
        System.out.println ("The Afterparty");
        System.out.println ("Croatia");
        String leo = IO.inputString("a, b, c, or d\n" );
        System.out.println ("You Said " + leo);
        System.out.println ("It was Tel Aviv which was (a)\n");

        System.out.println ("Where Did Leo go this summer");
        System.out.println ("Tel Aviv");
        System.out.println ("The Island");
        System.out.println ("The Afterparty");
        System.out.println ("Croatia");
        String archer = IO.inputString("a, b, c, or d\n" );
        System.out.println ("You Said " + archer);
        System.out.println ("It was The Island which was (b)\n");

        System.out.println ("Where Did Dominik go this summer");
        System.out.println ("Tel Aviv");
        System.out.println ("Middle Of No Where");
        System.out.println ("The Afterparty");
        System.out.println ("Croatia");
        String dom = IO.inputString("a, b, c, or d\n" );
        System.out.println ("You Said " + dom);
        System.out.println ("It was Middle Of No Where which was (b)\n");

        System.out.println ("Where Did You go this summer");
        System.out.println ("Tel Aviv");
        System.out.println ("Afghanistan");
        System.out.println ("The Afterparty");
        System.out.println ("Idk");
        String me = IO.inputString("a, b, c, or d\n" );
        System.out.println ("You Said " + me);
        System.out.println ("It was Idk which was (d)\n");
    }
}
