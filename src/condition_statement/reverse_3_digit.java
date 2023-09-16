package condition_statement;

import java.util.Scanner;

public class reverse_3_digit
{  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
 int a= sc.nextInt();
 int rev=0;
 while(a!=0) {
 	 int rem=a%10;
  rev = rev*10 + rem;
  a=a/10;
	}
System.out.println(" the number is" +rev);
}}
