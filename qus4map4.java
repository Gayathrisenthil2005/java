package javaproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class qus4map4
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int rollno;
		String name;
		String marks;
		String grade;
		HashMap<Integer,HashMap<String,String>> obj = new HashMap<Integer,HashMap<String,String>>();
		for(int i=0;i<3;i=i+1)
		{
			System.out.println("roll number:");
			rollno=scan.nextInt();
			scan.nextLine();
			System.out.println("name:");
			name=scan.nextLine();
			System.out.println("marks:");
			marks=scan.nextLine();
			System.out.println("grade:");
			grade=scan.nextLine();
			scan.nextLine(); 
			HashMap<String,String>stud=new HashMap<>();
			stud.put("name", name);
			stud.put("marks",marks);
			stud.put("grade", grade);
			obj.put(rollno,stud);			            
		}
		for(Map.Entry<Integer,HashMap<String,String>>e:obj.entrySet())
		{
			System.out.println("rollno:"+e.getKey());
			HashMap<String,String>stud=e.getValue();
			System.out.println("name:"+stud.get("name"));
			System.out.println("marks:"+stud.get("marks"));
			System.out.println("grade:"+stud.get("grade"));
			
			
		}
	}
}
