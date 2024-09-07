package javaproject;
public class evennumbersarray
{
	public static void main(String args[])
	{
		int[]arr= {1,6,8,9,4,5,10};
		for(int i=0;i<arr.length;i=i+1)
		{
		int number;
		number=arr[i];
		if(number%2==0)
		{
			System.out.println("even"+" "+number);
		}
		}
	}
}
