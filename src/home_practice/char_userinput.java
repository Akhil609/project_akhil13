package home_practice;
import java.util.Scanner;
public class char_userinput {

	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("please type any alphabet");
	char c= sc.next().charAt(0);
	System.out.println("you entered : " +c);
	if(c>='a' && c<='z')
	{
		System.out.println("true");
		
	}
	else 
	{
		System.out.println("try again and enter only alphabets");
	}
	}}