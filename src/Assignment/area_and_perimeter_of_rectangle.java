package Assignment;

import java.util.Scanner;

public class area_and_perimeter_of_rectangle
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the length");
	double l = sc.nextDouble();
	System.out.println("enter the breadth");
	double b = sc.nextDouble();
		
	double A = (l*b);
	System.out.println("Area of rectangle is" + A);
	 double Perimeter =2*(l+b);
	 System.out.println("Perimeter of rectangle is" + Perimeter);
	}
}
