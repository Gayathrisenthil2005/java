package javaproject;
public class eg14loop
{
	public static void main(String args[])
	{
		int n=20;
		for(int a=1;a<=n;a=a+1)
		{
			for(int b=1;b<=n;b=b+1)
			{
				for(int c=1;c<=n;c=c+1)
				{
					if(a*a + b*b==c*c)
					{
						System.out.println("pythagorean" + " "+a+ " " +b+ " " +c);
					}
				}
			}
		}
	}
}
