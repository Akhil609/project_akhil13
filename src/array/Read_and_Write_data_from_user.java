package array;
import java.util.Scanner;
public class Read_and_Write_data_from_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the elements");
int n=sc.nextInt();
int a[]=new int[n];// we can assign value 10,20,30 etc.
System.out.println("Enter the elements of an array");
for(int i=0;i<=n-1;i++)
	 	
		a[i]=sc.nextInt();
System.out.println("Entered elements of an array are:");
for(int i=0;i<n;i++)
	System.out.println(a[i]);
		
	}

}
