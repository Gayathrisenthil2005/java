package javaproject;
public class sumarray
{
	public static void main(String args[])
	{
		int[]arr= {1,6,8,9,4,5,10};
		int a;
		int sum=0;
		for(int i=0;i<arr.length;i=i+1)
		{ 
			a=arr[i];
			sum+=a;
		}
		System.out.println(sum);	
	}
}
