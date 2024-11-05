package javaproject;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class qus6map6
{
	public static void main(String args[])
	{
		HashMap<String,Integer>D1=new HashMap<>();
		D1.put("a", 1);
		D1.put("b", 2);
		D1.put("c", 3);
		HashMap<String,Integer>D2=new HashMap<>();
		D2.put("a", 4);
		D2.put("e", 5);
		D2.put("f", 6);
		ArrayList<String>keysD1=new ArrayList<>(D1.keySet());
		System.out.println("overlapping keys:");
		for(String key:keysD1)
		{
			if(D2.containsKey(key))
			{
				System.out.println(key+" ");
			}
		}
		System.out.println();
		
	}
}
