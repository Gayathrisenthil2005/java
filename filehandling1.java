package javaproject;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class filehandling1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a count");
		int count=sc.nextInt();
		sc.nextLine();

		try
		{
			FileWriter mywriter=new FileWriter("D:\\filehandling.txt");
			for(int i=1;i<count;i=i+1)
			{
			System.out.println("enter a sentence:");
			String sent=sc.nextLine();
				mywriter.write(sent);
				mywriter.write("\n");
			}
			mywriter.close();
		}
		catch(Exception e)
		{
			System.out.println("error"+e.getMessage());
		}
		 
			try
			{
				File read1=new File("D:\\filehandling.txt");
				Scanner reader=new Scanner(read1);
			    while(reader.hasNextLine())
			    {
			    	String line=reader.nextLine();
			    	System.out.println(line);
			    }
			}
			catch(Exception e)
			{
				System.out.println("error"+e.getMessage());
			}
	}
}
