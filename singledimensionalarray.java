package javaproject;
import java.util.Scanner;
public class singledimensionalarray
{
	public static void main(String args[])
	{
		int []c=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i=i+1)
		{
			System.out.println("enter number:");
			int a=scan.nextInt();
			c[i]=a;
		}
		for(int z:c)
		{
			System.out.println(z);
		}
		
	}
}
