package Unit2;

public class petFoodPlanner {
    public static void main(String args[]) {
        new petFoodPlanner();
    }
    //printing stats
    public petFoodPlanner() {
        int dogs = getDogs();
        int days = getDays();
        double Food = calculateFood( dogs, days);
        System.out.println("Dogs : " + dogs);
        System.out.println("Days : " + days);
        System.out.println("Food : " + Food + "kg");
    }
    //finding amt of dogs based off user
    public int getDogs(){
        int dogs = IO.inputInt ("How Many Dogs? ");
        return dogs;
    }
    //finding amt of days based off user
    public int getDays() {
        int days = IO.inputInt("How Many Dogs? ");
        return days;
    }
    //calculating amt of food
    public double calculateFood(int dogs,int days) {
      double Food = (dogs * days * 250) / 1000;
      return Food;
    }
}
