package javaproject;
import java.util.Scanner;
public class stringqus5
{
	public static void main(String args[])
	{
		int num=0;
		int sum=0;
		int number=0;
		int count;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the count:");
		count=scan.nextInt();
		System.out.println("enter"+count+"number:");
		for(int i=0;i<count;i=i+1)
		{
			int a=scan.nextInt();
			num=a;
			sum=sum+num;
		}
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter the value:");
		String b=scan1.nextLine();
		int s=b.length();
		System.out.println("string length:"+" "+s);
		for(int i=0;i<s;i=i+1)
		{
			char m=b.charAt(i);
			if(Character.isDigit(m))
			{
				number+=(int)m-48;
			}
			else
			{
				int c=1;
			}
		}
		System.out.println("sum of the integer:"+sum);
		System.out.println("sum of the String:"+number);
		int total;
		total=sum+number;
		System.out.println("sum of the number:"+total);
	}
}
