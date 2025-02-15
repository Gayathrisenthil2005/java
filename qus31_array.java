package java_course;
public class qus31_array
{
	public static void main(String args[])
	{
		int count=0;
		int [][]matrix= {{1,0,0},
				         {0,1,0},
				         {0,0,1}
		                 };
		for(int i=0;i<matrix.length;i=i+1)
		{
			for(int j=0;j<matrix.length;j=j+1)
			{
				if(i==j && matrix[i][j]==1)
				{
					count++;
				}
				
			}
			
		
				         
		}
		if(count==3)
		{
			System.out.println("it is identity matrix");
		}
		else
		{
			System.out.println("not");
		}
	}
}
