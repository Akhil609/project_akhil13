package condition_statement;
import java. util.Scanner;
public class leapyear {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year in digit");
		int a = sc.nextInt();
		
		if(a%400==0)
		System.out.println("leap year");
		else if(a%4==0)
		{
		System.out.println("leap year");
		}
	else if(a%100==0)
		{
		System.out.println("not a leap year");
		}
		else
		{
			System.out.println("not a leap year");
	}
}
}