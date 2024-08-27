package javaproject;
class manager1
{
	public int a;
	protected int b;
	private int c=300;
	void fun()
	{
		System.out.println(a);
	}
	private void fun1()
	{
		System.out.println(c);
	}
	manager1()
	{
		a=200;
		b=100;
	}
	void fun2()
	{
		System.out.println(b);
	}
}
class manager2 extends manager1
{
	int d=20;
	void fun3()
	{
		System.out.println(d);
	}
}
public class encapsulation
{
	public static void main(String args[])
	{
		manager1 type1=new manager1();
		type1.fun();
		type1.fun2();
		manager2 data=new manager2();
		data.fun();
		data.fun2();
		data.fun3();
		
	}
}
