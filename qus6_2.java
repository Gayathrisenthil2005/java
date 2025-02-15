package java_course;
public class qus6_2
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i=i-1)
		{
			for(int j=5;j>(5-i);j=j-1)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
