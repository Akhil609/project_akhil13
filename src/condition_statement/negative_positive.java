package condition_statement;

import java.util.Scanner;

public class negative_positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers in percentage ");
		float a= sc.nextFloat();
		if(a==0)
			System.out.println("Grade A");
			else if(a<80 && a>=60)
			{
			System.out.println("grade b");
			}
		else if(a>=40 && a<=60)
			{
			System.out.println("grade c"); 
			}
			else if(a<40) {
				System.out.println("Try Again \nFail!"); 
			}
	}

}
