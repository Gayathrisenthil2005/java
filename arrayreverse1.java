package javaproject;
public class arrayreverse1
{
	public static void main(String args[])
	{
		int [][]arr= {{1,2,3,4,5},
			         {6,7,8,9,10},
			         {11,12,13,14,15}};
		for(int i=0;i<arr.length;i=i+1)
		{
			for(int j=(arr[i].length)-1;j>=0;j=j-2)
		{
			System.out.print(arr[i][j]);
		}
		System.out.println();
		}
	}
}
