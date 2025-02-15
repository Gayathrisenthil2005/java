package java_course;
public class qus6
{
	public static void main(String args[])
	{
		int rows=4;
		int number;
		for(int i=0;i<rows;i++)
		{
			number=2*i+1;
			for(int j=i;j>=0;j--)
			{
				System.out.print(number+" ");
				number-=2;
			}
			System.out.println();
		}
	}
}
