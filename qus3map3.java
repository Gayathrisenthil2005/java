package javaproject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
public class qus3map3
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		HashMap<String,Integer> obj=new HashMap<String,Integer>();
		obj.put("jan", 31);
		obj.put("feb", 28);
		obj.put("mar", 31);
		obj.put("apr", 30);
		obj.put("may", 31);
		obj.put("jun", 30);
		obj.put("july", 31);
		obj.put("aug", 31);
		obj.put("sep", 30);
		obj.put("oct", 31);
		obj.put("nov", 30);
		obj.put("dec", 31);
		System.out.println("enter month name:");
		String month=scan.nextLine();
		Vector<String> a=new Vector<>();
		for(Map.Entry<String,Integer> e:obj.entrySet() )
    	{
    		if(month.equals(e.getKey()))
    		{
    			//System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    		}
    		if(e.getValue()==31)
    		{
    			System.out.println("key:"+e.getKey()+"value:"+e.getValue());
    		
    		}
    		if(e.getValue()==28)
    		{
    			System.out.println(e.getKey()+e.getValue());
    		
    		}
    		if(e.getValue()==30)
    		{
    			System.out.println(e.getKey()+e.getValue());
    			
    		}
    		a.add(e.getKey());
    		
    	}
		Collections.sort(a);
		for(String i:a)
		{
			//System.out.println(i);
		}
	
		
		
	}
}
