package java_course;
class orange
{
	void func1()
	{
		System.out.println("class");
	}
	void func2()
	{
		System.out.println("class2");
	}
}
class graphs extends orange
{
	void func1()
	{
		System.out.println("class");
	}
	void func2()
	{
		System.out.println("class2");
		super.func2();
	}
}
public class superkeyword
{
	public static void main(String args[])
	{
		graphs c= new graphs();
		c.func2();
	}
}
