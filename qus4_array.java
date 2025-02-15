package java_course;
public class qus4_array
{
	public static void main(String args[])
	{
		int[]arr1= {1,2,3,4,5};
		int[]arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i=i+1)
		{
			arr2[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i=i+1)
		{
			System.out.println(arr2[i]);
		}
		
		
	}
}
