package javaproject;
interface X
{
	void a();
	void b();
}
interface Y
{
	void c();
	void d();
}
class Z implements X,Y
{
	public void a()
	{
		System.out.println("a");
	}
	public void b()
	{
		System.out.println("b");
	}
	public void c()
	{
		System.out.println("c");
	}
	public void d()
	{
		System.out.println("d");
	}
}
public class interfaceexam
{
	public static void main(String args[])
	{
		Z type=new Z();
		type.a();
		type.b();
		type.c();
		type.d();
	}
}
