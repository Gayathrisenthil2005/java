package javaproject;
class manager
{
	void fun1()
	{
		System.out.println("Manager");
	}
}
class TL1 extends manager
{
	void fun2()
	{
		System.out.println("TL1");
	}
}
class TL2 extends manager
{
	void fun3()
	{
		System.out.println("TL2");
	}
}
class JE1 extends TL1
{
	void fun4()
	{
		System.out.println("JE1");
	}
}
class JE2 extends TL1
{
	void fun5()
	{
		System.out.println("JE2");
	}
}
class JE3 extends TL2
{
	void fun6()
	{
		System.out.println("JE3");
	}
}
class JE4 extends TL2
{
	void fun7()
	{
		System.out.println("JE4");
	}
}
public class multipleinheritance
{
	public static void main(String args[])
	{
		manager type=new manager();
		type.fun1();
		JE2 type1=new JE2();
		type1.fun1();
		type1.fun2();
		type1.fun5();
	}
}
