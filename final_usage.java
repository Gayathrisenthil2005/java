package java_course;
class parent1
{
	final int a=100;
	final int b=200;
	void func1()
	{
		System.out.println("one");
	}
}
class apple extends parent1
{
	void func1()
	{
		System.out.println("two");
	}
}
public class final_usage
{
	public static void main(String args[])
	{
		apple a1=new apple();
		//a1.a=200;
		//System.out.println(a1.a);
		a1.func1();
	}
}
