package javaproject;

import java.util.ArrayList;

public class arraylist
{
	public static void main(String args[])
	{
		ArrayList<String>cities=new ArrayList<String>();
		cities.add("chennai");
		cities.add("erode");
		cities.add("Tirupur");
		cities.add("delhi");
		for(String i:cities)
		{
			System.out.println(i);
		}
	}
}
