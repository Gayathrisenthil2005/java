package javaproject;
public class eg18loop
{
	public static void main(String args[])
	{
		int n=20;
		int x=2;
		while(n>0)
		{
		if(n%x==0)
		{
			n=n/x;
			System.out.println(x);
		}
		else
		{
			x++;
		}
		}
	}
}
			
