package javaproject;
import java.util.Scanner;
public class phonenumberstring
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 10 digit phone number using - :");
		String number=scan.nextLine();
		int s= number.length();
		if(number.charAt(3)=='-' && number.charAt(7)=='-' && s==12 )
		{
			System.out.print("valid number");
		}
		else
		{
			System.out.print("not valid");
		}
		
	}

}
