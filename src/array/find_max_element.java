package array;

import java.util.Scanner;

public class find_max_element {
	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.println("Enter the elements");
int n=sc.nextInt();
int a[]=new int[n];// we can assign value 10,20,30 etc.
System.out.println("Enter the elements of an array");
for(int i=0;i<=n-1;i++)
{
	a[i]=sc.nextInt();
}
int max=a[0];
for (int i=0;i<n;i++)
{
	if(max<a[i])
	{
		max=a[i];
	}}
	
	System.out.println("largest no is "  +  max);
}}

	