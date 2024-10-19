package javaproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class qus2map
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		HashMap<Integer,Integer>obj=new HashMap<Integer,Integer>();
		for(int i=1;i<=3;i=i+1)
		{
			System.out.println("enter key:");
			int a=scan.nextInt();
			System.out.println("enter value:");
			int b=scan.nextInt();
			obj.put(a,b);
		}
		for(Map.Entry<Integer, Integer> e:obj.entrySet() )
		{
			
			System.out.println("Key:"+e.getKey()+" "+"Value:"+e.getValue());
		}
	}
}
