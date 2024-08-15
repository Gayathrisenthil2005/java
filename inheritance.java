package javaproject;
class parent
{
	int x;
	void type1()
	{
		System.out.println(x);
	}
}
class child extends parent
{
	int y;
	void type2()
	{
		System.out.println(y);
	}
}
class grandchild extends child
{
	int z;
	void type3()
	{
		System.out.println(z);
	}
}
public class inheritance
{
	public static void main(String args[])
	{
		child data=new child();
		data.x=20;
		data.type1();
		data.y=30;
		data.type2();
		parent data1=new parent();
		data1.x=10;
		data1.type1();
		grandchild data2=new grandchild();
		data2.x=30;
		data2.type1();
		data2.y=40;
		data2.type2();
		data2.z=50;
		data2.type3();
	}
}
