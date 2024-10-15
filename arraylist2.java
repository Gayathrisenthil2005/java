package javaproject;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist2
{
	public static void main(String args[])
	{
		ArrayList<String>cities=new ArrayList<String>();
		cities.add("chennai");
		cities.add("erode");
		cities.add("Tirupur");
		cities.add("delhi");
		Iterator<String> it = cities.iterator();
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(String i:cities)
		{
			System.out.println(i);
		}
	}
}
