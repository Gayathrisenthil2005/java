package javaproject;
import java.util.Scanner;
public class stringqus2
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		String a=scan.nextLine();
		int s=a.length();
		System.out.println(s);
		int sum=0;
		for(int i=0;i<s;i=i+1)
		{
			char n=a.charAt(i);
			if(Character.isDigit(n)==true)
			{
				sum=sum+(int)n-48;
			}
		}
		System.out.println(a);
		System.out.print("sum:");
		System.out.println(sum);
	}
}
	
