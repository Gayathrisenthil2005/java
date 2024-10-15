package javaproject;

import java.util.LinkedList;

public class linkedlist
{
	public static void main(String args[])
	{
		LinkedList<String>arrstr=new LinkedList<String>();
		arrstr.add("bill gates");
		arrstr.add("steve jobs");
		arrstr.add("elon musk");
		arrstr.add("jack ma");
		System.out.println(arrstr);
		for(int i=0;i<arrstr.size();i=i+1)
		{
			System.out.println(arrstr.get(i));
		}
	}
}
