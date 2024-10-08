package javaproject;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
public class FileHandling
{
	public static void main(String args[])
	{
		try
		{
			FileWriter mywriter=new FileWriter("D:\\javafile.txt");
			mywriter.write("the story\n");
			mywriter.write("reach the goal");
			mywriter.close();
		}
		catch(Exception e)
		{
			System.out.println("error"+e.getMessage());
		}
		try
		{
			File read1=new File("D:\\javafile.txt");
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
