package javaproject;

import java.util.Scanner;
import java.util.Vector;

public class vectorqus2
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Vector<Integer> vec=new Vector<Integer>();
		for(int i=1;i<=10;i=i+1)
		{
			System.out.println("enter number:");
			int a=scan.nextInt();
			vec.add(a);
			
		}
		Vector<Vector>vec2=new Vector();
		vec2.addElement(vec);
		System.out.println(vec2.get(0));
	}
}
