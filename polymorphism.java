package javaproject;
class data
{
	void func(int a)
	{
		System.out.println(a);
	}
	void func(int a,float b)
	{
		System.out.println(+a +" "+b);
	}
	void func(float a,float b)
	{
		System.out.println(+a +" "+b);
	}
	void func(int a,byte b)
	{
		System.out.println(+a +" "+b);
	}
}
public class polymorphism
{
	public static void main(String args[])
	{
		data poly=new data();
		poly.func(100);
		poly.func(200,(float)20.5);
		poly.func((float)30.6,(float)30.9);
		poly.func(200,(byte)125);
		
	}
}
