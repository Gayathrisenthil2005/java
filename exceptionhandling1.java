package javaproject;
public class exceptionhandling1
{
	public static void main(String args[])
	{
		try
		{
			int x=10/0;
			int b[]=new int[5];
			b[5]=10/5;
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("not occur");
		}
	}
}
