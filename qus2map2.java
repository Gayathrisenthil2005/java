package javaproject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class qus2map2
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String product;
		int price;
		HashMap<String, Integer> obj = new HashMap<String,Integer>();
		for(int i=0;i<3;i=i+1)
		{
			System.out.println("Enter key:product name:");
			product=scan.nextLine();
			System.out.println("Enter value: price value:");
			price=scan.nextInt();
			scan.nextLine(); 
			obj.put(product, price);            
		}
		System.out.println("enter product name:");
        String s=scan.nextLine();
      
        	for(Map.Entry<String,Integer> e:obj.entrySet() )
        	{
        		if(s.equals(e.getKey()))
        		{
        			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        		}
        		else
        		{
        			System.out.println("product not found");
        			break;
        		}
        	}
	}
}
