package java_course;
import java.util.Scanner;
import java.util.ArrayList;
public class qus8
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the sentences");
		String s=scan.nextLine();
		String[] s1=s.split("");
		ArrayList<String> a=new ArrayList<String>();
		for(String w:s1)
		{
			if(w.contains("ing"))
			{
				int c=0;
				for(int i=0;i<w.length();i=i+1)
				{
					if(w.charAt(i)=='i' && w.charAt(i+1)=='n' && w.charAt(i+2)=='g')
					{
						c++;
					}
				}
				if(c==1)
				{
					System.out.println(w);
				}
			}
		}
	}
}
