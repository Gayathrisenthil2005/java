package javaproject;
public class eg11loop
{
	public static void main(String args[])
	{
		for(int i=0;i<10;i=i+1)
		{
			for(int j=(10*i)+1;j<=10*(i+1);j=j+1)
			{
				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}
			
}
			
