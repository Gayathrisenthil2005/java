package javaproject;
class vehicle1
{
	int getnumbers()
	{
		return 0;
	}
}
class bus1 extends vehicle1
{
	int getnumbers()
	{
		return 1;
		//return super.getnumbers();
	}
}
class auto1 extends bus1
{
	int getnumbers()
	{
		return 8;
	}
}
public class inheritancewithpolymorphism
{
	public static void main(String args[])
	{
		bus1 data=new bus1();
		int x=data.getnumbers();
		System.out.println(x);
		
	}
}
