package javaproject;
import java.util.Scanner;
import java.util.Vector;

public class vectorqus1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Vector<String> vec=new Vector<String>();
		for(int i=0;i<3;i=i+1)
		{
			System.out.println("enter a sentence:");
			String sent=scan.nextLine();
			vec.add(sent);
		}
		Vector<Vector>vec2=new Vector();
		vec2.addElement(vec);
		System.out.println(vec2.get(0));
	}
}
