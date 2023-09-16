package condition_statement;

import java.util.Scanner;

public class month_name {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		System.out.println("enter the number of month");
		int a= sc.nextInt();
		switch (a)
		{
		
		case 1:
			System.out.println("januaury");
		break;
		case 2:
			System.out.println("feb");
		break;
		case 3:
			System.out.println("mar");
		break;
		case 4:
			System.out.println("apr");
		break;
		case 5:
			System.out.println("may");
		break;
		case 6:
			System.out.println("june");
		break;
		case 7:
			System.out.println("july");
		break;
		case 8:
			System.out.println("aug");
		break;
		case 9:
			System.out.println("sep");
		break;
		case 10:
			System.out.println("oct");
		break;
		case 11:
			System.out.println("nov");
		break;
		case 12:
			System.out.println("dec");
		break;
		default:
			System.out.println("enter between 1 to 12");
			break;
	}

}
}