package javaproject;

import java.util.Vector;

public class vector
{
	public static void main(String args[])
	{
		Vector<String> vec=new Vector<String>();
		vec.add("chennai");
		vec.add("bangalore");
		vec.add("delhi");
		vec.add("hyderabad");
		for(String i:vec)
		{
			System.out.println(i);
		}
		vec.insertElementAt("cochin", 1);
		for(String i:vec)
		{
			System.out.println(i);
		}
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		Vector <vector> vec1=new Vector<vector>();
		System.out.println(vec1.get(0));
	}
}
