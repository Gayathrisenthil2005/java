package javaproject;
import static java.lang.Math.*;
public class eg9loop
{
	public static void main(String args[])
	{
		int a=2;
		double sum=0;
		double y;
		for(int i=1;i<=4;i=i+1)
		{
			y= Math.pow(i,a)/i;
			sum=sum+y;
			
		}
		System.out.println(sum);
	}
}
