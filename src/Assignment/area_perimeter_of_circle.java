package Assignment;
import java.util.*;
public class area_perimeter_of_circle {
//Hint(Area - 3.14 *r*r, perimeter – 2*3.14*r).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the radius");
double r = sc.nextDouble();
	
double A = 3.14* r * r;
System.out.println("Area of circle is" + A);
 double Perimeter =2*3.14*r;
 System.out.println("Perimeter of circle is" + Perimeter);
}
}