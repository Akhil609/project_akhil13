package akhil133;

import java.util.Scanner;

public class zerotothousand {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a"); 
int a = sc.nextInt();
int b= a%1;
int c=a/100;
System.out.println(" mod of b is" + b);
System.out.println(" mod of c is" + c);
}}