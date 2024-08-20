package javaproject;
public class finalusage
{
	final int y;
	finalusage()
	{
		y=200;
	}
	void fun()
	{
		//y=400;
	}
	void fun1(final int m)
	{
		System.out.println(m);
		//m=7000;
		//System.out.println(m);
	}
public static void main(String args[])
{
	finalusage f=new finalusage();
	//f.y=300;
	System.out.println(f.y);
	f.fun1(6000);
}
}
