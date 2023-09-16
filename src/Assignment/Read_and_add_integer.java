package Assignment;

import java.util.Scanner;
public class Read_and_add_integer 
{
		 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Input an integer between 0 and 1000 ");
	     int num = sc.nextInt();
	     int A = num%10;
	     int a = num/10;		 
	     int B=a%10;
		 int b = a/10;
		 int C = a%10;
		 int c = a/10;
		
		 int sum = A+B+C;
		 System.out.print("SUM IS "+sum );
	}

}
