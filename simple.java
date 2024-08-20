package javaproject;
abstract class vehicle2
{
	abstract void run();//prototype
	void run1()
	{
		System.out.println("hello");
	}
}
class bike2 extends vehicle2
{
	void run2()
	{
		System.out.println("world");
	}
}
public class simple
{
	public static void main(String args[])
	{
		bike2 type=new bike2();
		type.run1();
		type.run2();
	}
}
