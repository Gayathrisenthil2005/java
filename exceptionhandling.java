package javaproject;
public class exceptionhandling
{
	public static void main(String args[])
	{
		try
		{
			int a=20;
			int b=a/0;
			System.out.println("stop");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			int a=20;
			int b=a/0;
			System.out.println("rest of the code");
		}
	}
}
