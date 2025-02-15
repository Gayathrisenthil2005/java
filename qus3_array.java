package java_course;
public class qus3_array
{
	public static void main(String args[])
	{
		int sum=0;
		int []arr= {1,2,3,4,5,6,7};
		for(int i=0;i<arr.length;i=i+1)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
