package javaproject;
public class exaexceptionhandling {
	static void func()
	{
		int a=100;
		int b=200;
		if(a<b)
		{
			throw new ArithmeticException();
		}
	}
public static void main(String args[])
{
	func();
}
}
