import java.util.Scanner;
class area{
    public double Circle(double Radius){
        double result=3.14 * Radius* Radius;
        return result;
    }
}
public class areaofcircle {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius=SC.nextDouble();
        area r=new area();
        double a=r.Circle(radius);
        SC.close();
        System.out.println("The area is: "+a);
    }
    
}
