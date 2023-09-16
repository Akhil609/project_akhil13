package akhil133;
import java.util.Scanner;

public class Area 
{

	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter width of triangle");
	int w=sc.nextInt();
	System.out.println("enter height of triangle");
	int h=sc.nextInt();
	int area=(w*h)/2;
	System.out.println(" area of triangle is  " + area);
	
}
}