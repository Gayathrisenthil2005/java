package javaproject;
import java.util.Scanner;
class calculator
{
	int x;
	int y;
	int z;
	void addition(int a,int b)
	{
		x=a;
		y=b;
		z=a+b;
		System.out.println(z);
	}
	void subtraction(int a,int b)
	{
		x=a;
		y=b;
		z=a-b;
		System.out.println(z);
	}
	void multiplication(int a,int b)
	{
		x=a;
		y=b;
		z=a*b;
		System.out.println(z);
	}
	void division(int a,int b)
	{
		x=a;
		y=b;
		z=a/b;
		System.out.println(z);
	}
	void modulus(int a,int b)
	{
		x=a;
		y=b;
		z=a%b;
		System.out.println(z);
		
	}
}
public class task1
{
	public static void main(String args[])
	{
		int a;
		int b;
		int k=0;
		System.out.println("enter a:");
		Scanner scan=new Scanner(System.in);
		 a=scan.nextInt();
		 System.out.println("enter b :");
		 b=scan.nextInt();
		calculator view=new calculator();
		{
			System.out.println("1.addition,2.subtraction,3.multiplication,4.divison,5.modulus,6.exit");
			k=scan.nextInt();
			switch(k)
			{
			case 1:
				view.addition(a, b);
				break;
			case 2:
				view.subtraction(a,b);
				break;
			case 3:
				view.multiplication(a,b);
				break;
			case 4:
				view.division(a,b);
				break;
			case 5:
				view.modulus(a, b);
				break;
			case 6:
				break;
			default:
				System.out.println("error");
				break;
			}
		}
	}
}
	
