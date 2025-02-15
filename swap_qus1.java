package java_course;

import java.util.Scanner;

public class swap_qus1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=scan.nextInt();
		System.out.println("enter b value:");
		int b=scan.nextInt();
		int temp;
		temp =a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}
