public class mat {
    public static void main(String[] args) {
        new mat();
    }
    public mat() {

        System.out.println("***** Rectangle Area *****");
        double length = IO.inputDouble("Enter The length : ");
        double wdth = IO.inputDouble("Enter The width : ");
        double P = 2*(wdth+length);
        double A = wdth*length;
        System.out.println("The perimeter of the Rectangle is " + P + "units");
        System.out.println("The area of the Rectangle is " + A + "units\u00B2");

        System.out.println("***** Trapezoid Area *****");
        double a = IO.inputDouble("Enter The a : ");
        double b = IO.inputDouble("Enter The b : ");
        double c = IO.inputDouble("Enter The c : ");
        double d = IO.inputDouble("Enter The d : ");
        double h = IO.inputDouble("Enter The height : ");
        double AT = ((a+b)*h)/2;
        double PT = a+b+c+d;
        System.out.println("The perimeter of the Trapezoid is " + PT + "units");
        System.out.println("The area of the Trapezoid is " + AT + "units\u00B2");

        System.out.println("***** Circle Area *****");
        double R = IO.inputDouble("Enter The Radius : ");
        double AC = Math.PI*Math.pow(R,2);
        double PC = 2*Math.PI*R;
        System.out.println("The perimeter of the Circle is " + PC + "units");
        System.out.println("The area of the Circle is " + AC + "units\u00B2");

        System.out.println("***** Cone Area *****");
        double r = IO.inputDouble("Enter The Radius : ");
        double H = IO.inputDouble("Enter The Height : ");
        double V = H/3*(Math.PI*Math.pow(r,2));
        double SA = Math.PI*(R + Math.sqrt((Math.pow(H,2)+(Math.pow(R,2)))));
        System.out.println("The surface area of the Cone is " + SA + "units\u00B2");
        System.out.println("The volume area of the Cone is " + V + "units\u00B3");
    }
}
