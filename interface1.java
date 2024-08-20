package javaproject;
interface A
{
	void a();
	void b();
	void c();
	void d();
}
class B implements A
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
class m extends B
{
	public void e()
	{
		System.out.println("e");
	}
}
public class interface1
{
	public static void main(String args[])
	{
		m type=new m();
		type.a();
		type.b();
		type.c();
		type.d();
		type.e();
	}
}
