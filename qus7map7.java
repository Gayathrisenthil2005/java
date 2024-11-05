package javaproject;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.ArrayList;
public class qus7map7
{
	public static void main(String args[])
	{
		HashMap<String,Integer>D1=new HashMap<>();
		D1.put("a", 1);
		D1.put("b", 2);
		D1.put("c", 3);
		HashMap<String,Integer>D2=new HashMap<>();
		D2.put("a", 4);
		D2.put("b", 5);
		D2.put("c", 6);
		ArrayList<String>keysD1=new ArrayList<>(D1.keySet());
		int count=0;
		for(String key:keysD1)
		{
			if(D2.containsKey(key))
			{
				count=count+1;
			}
			
		}
		System.out.println(count+"keys are same");
        System.out.println();
        
		
	}
}
