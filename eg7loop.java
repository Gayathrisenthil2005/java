package javaproject;
import static java.lang.Math.*;
public class eg7loop
{
	public static void main(String args[])
	{
		double sum=0;
		int x=2;
		for(int i=0;i<=4;i=i+1)
		{
		    sum = sum + Math.pow(x,i);
		}
		System.out.println(sum);
	}
}
