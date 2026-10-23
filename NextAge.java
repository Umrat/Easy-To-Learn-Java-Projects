public class NextAge {

    public static void main(String arg[]) {
        new NextAge();
    }

    public NextAge() {
        int name = IO.inputInt("Age of Youngest Kid?\n");
        System.out.println("Age Is " + name);
        int lstname = IO.inputInt("Age of Middle Child?\n");
        System.out.println("Age Is " + lstname);
        System.out.println("The Eldest Kid Is:" + (lstname+lstname-name));
    }
}