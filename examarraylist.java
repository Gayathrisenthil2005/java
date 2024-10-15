package javaproject;
import java.util.ArrayList;
import java.util.Scanner;

public class examarraylist
{
	public static void main(String args[])
	{
	    String m;
		Scanner scan=new Scanner(System.in);
		ArrayList<String>names=new ArrayList<String>();
		for(int i=1;i<=5;i=i+1)
		{
			System.out.println("enter a sentence:");
			String sent=scan.nextLine();
			names.add(sent);
		}
		for(String i:names)
		{
			System.out.println(i);
		}
	}
}
