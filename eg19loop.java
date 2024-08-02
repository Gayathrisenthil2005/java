package javaproject;
public class eg19loop
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=1;i<4;i=i+1)
		{
			for(int j=1;j<=i;j=j+1)
			{
				sum=sum+j;
			}
		}
		System.out.println(sum);
	}
}
