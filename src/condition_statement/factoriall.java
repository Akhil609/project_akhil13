package condition_statement;

import java.util.*;

public class factoriall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
 int a= sc.nextInt();
 int i=1,fact=1;
 while(i<=a)
 {
     fact=fact*i;
     i++;
}
System.out.println("the factorial of no is " + fact);
	
	
	
	
	
	
	
	}
	

}
