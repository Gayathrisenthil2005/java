package javaproject;
import static java.lang.Math.*;
public class eg13loop
{
	public static void main(String args[])
	{
		int flog=0;
		int a=2;
		double sum=1;
		double y;
		for(int i=2;i<=4;i=i+1)
		{
			y= Math.pow(i,a);
			if(flog ==0)
			{
			sum=sum+y;
			flog=1;
			}
			else
			{
				sum=sum-y;
				flog=0;
			}
			
		}
		System.out.println(sum);
	}
}
