package javaproject;
import java.util.Scanner;
public class stringqus3
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the sentence:");
		String a=scan.nextLine();
		int s=a.length();
		int count=0;
		int value=0;
		for(int i=0;i<a.length();i=i+1)
		{
			if(a.charAt(i)==' ')
			{
				count =count+1;
			}
			if(Character.isAlphabetic(a.charAt(i))||Character.isDigit(a.charAt(i)))
			{
				value=value+1;
			}
		}
		System.out.println(count);
		System.out.println(s);
		System.out.println(value);
		float avg=(float)value/s;
		System.out.println(avg*100);
	}
}
