package javaproject;
import java.util.Scanner;
public class stringqus4
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence=scan.nextLine();
		int s=sentence.length();
		for(int i=0;i<s;i=i+1)
		{
			char m=sentence.charAt(i);
			if(Character.isUpperCase(m))
			{
				System.out.print(Character.toLowerCase(m));
		    }
			else if(Character.isLowerCase(m))
	        {
			   System.out.print(Character.toUpperCase(m));
			}
			else
			{
				System.out.print(m);
			}
		}
	}
}
