package Assignment;
import java.util.*;
public class three_numbers_as_input_and_average 
{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
	double a=sc.nextDouble();
	System.out.println("enter the second number");
	double b=sc.nextDouble();
	System.out.println("enter the third number");
	double c=sc.nextDouble();
	double d =(a+b+c)/3;
	System.out.println("average of the numbers are " +d);
	
	}

}
