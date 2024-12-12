package java_course;
class animal
{
	void func2()
	{
		System.out.println("hello");
	}
}
class dog extends animal
{
	void func1()
	{
		System.out.println("world");
	}
}
public class dynamic_binding
{
	public static void main(String args[])
	{
		animal d1=new dog();
		d1.func2();
		//dog d2=new animal();
		
	}
}
