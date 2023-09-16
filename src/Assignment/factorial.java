package Assignment;
import java.util.*; 
public class factorial
	{ 
	public static void main(String args[]) 
	{ 
	Scanner sc =new Scanner(System.in); 
    System.out.print("Input an integer ");
	int a=sc.nextInt(); 
	int sum=0;  
	while(a!=0) 
	{ 
	 	sum=sum+(a%10); 
		a=a/10;
	}  
	System.out.println(sum); 
	} 
	
}

