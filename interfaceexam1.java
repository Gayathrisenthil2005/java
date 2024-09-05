package javaproject;
interface X
{
	void a();
	void b();
}
interface Y
{
	void a();
	void b();
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
	
}
public class interfaceexam1
{
	public static void main(String args[])
	{
		Z type=new Z();
		type.a();
		type.b();
		//type.c();
		//type.d();
	}
}
