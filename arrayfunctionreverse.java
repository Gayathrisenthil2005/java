package javaproject;
public class arrayfunctionreverse
{
	public static void main(String args[])
	{
		int []arr={1,2,10,4,12,15};
		for(int i=(arr.length)-1;i>=0;i=i-1)
		{
			System.out.println(arr[i]);
		}
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
}
