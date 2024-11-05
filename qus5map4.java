package javaproject;
import java.util.HashMap;
import java.util.Map;
public class qus5map4
{
	public static void main(String args[])
	{
		HashMap<String,String>obj=new HashMap<>();
		obj.put("k1", "v1");
		obj.put("k2", "v2");
		obj.put("k3", "v3");
		HashMap<String,String>invertedX=new HashMap<>();
		for(Map.Entry<String,String> e:obj.entrySet() )
		{
			invertedX.put(e.getValue(),e.getKey());
		}
		System.out.println("inverted dictionary:"+invertedX);
	}
}
