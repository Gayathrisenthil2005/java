package javaproject;
class vehicle
{
	int a=10;
	void data()
	{
		System.out.println(a);
	}
	
}
class bus extends vehicle
{
	int b=20;
	void data1()
	{
		System.out.println(b);
	}
}
class lorry extends bus
{
	int c=30;
	void data2()
	{
		System.out.println(c);
	}
}
class bike extends lorry
{
	int d=40;
	void data3()
	{
		System.out.println(d);
	}
}
public class task
{
	public static void main(String args[])
	{
		bus display=new bus();
		display.a=30;
		display.data();
		display.b=20;
		display.data1();
		vehicle display1=new vehicle();
		display1.a=60;
		display1.data();
		lorry display2=new lorry();
		display2.a=300;
		display2.data();
		display2.b=500;
		display2.data1();
		display2.c=100;
		display2.data2();
		bike display3=new bike();
		display3.a=10;
		display3.data();
		display3.b=20;
		display3.data1();
		display3.c=200;
		display3.data2();
		display3.d=500;
		display3.data3();
		
		
	}
}
