package javaproject;
import static java.lang.Math.*;
public class eg8loop
{
	public static void main(String args[])
	{
		double sum=0;
		double x=2;
		double y;
		int f=0;
	   for(int i=1;i<=4;i=i+1)
	   {
		   y=Math.pow(x,i);
		   if(f==0)
		   {
			   sum=sum-y;
			   f=1;
		   }
		   else
		   {
			   sum=sum+y;
			   f=0;
		   }
		  }
	   System.out.println(sum);
    }
}
