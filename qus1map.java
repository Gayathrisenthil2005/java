package javaproject;

import java.util.HashMap;
import java.util.Map;

public class qus1map
{
	public static void main(String args[])
	{
		HashMap<String,Integer>obj=new HashMap<String,Integer>();
		obj.put("abc", 100);	
		obj.put("def", 700);
		obj.put("ghi", 500);
		obj.put("jkl", 200);
		System.out.println(obj.get("abc"));
		for(Map.Entry<String, Integer> e:obj.entrySet() )
		{
			
			System.out.println("Key:"+e.getKey()+" "+"Value:"+e.getValue());
		}
	}
			
}
