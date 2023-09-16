package condition_statement;
import java.util.Scanner;
public class vandc {

	public static void main(String[] args) {
		char ch;
		Scanner sc =new Scanner(System.in);
		 ch= sc.next().charAt(0);
		System.out.println("enter the Alphabet");
		switch (ch)
		{
		case 'a':
			System.out.println(ch+" is a vowel ");
			break;
		case 'e' :
			System.out.println(ch+" is a vowel ");
			break;
		case 'i' :
			System.out.println(ch+" is a vowel ");
			break;
		case 'o' :
			System.out.println(ch+" is a vowel ");
			break;
		case 'u' :
			System.out.println(ch+" is a vowel ");
			
		break;
		default:
			System.out.println(ch+ " is a consonant");
			break;
		}
}}
