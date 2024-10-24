package javaproject;

import java.util.HashMap;
import java.util.Vector;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class qus1map1 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        HashMap<String, ArrayList<Float>> obj = new HashMap<>();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter key:");
            String team = scan.nextLine();

            System.out.println("Enter wins:");
            float wins = scan.nextFloat();
            
            System.out.println("Enter losses:");
            float loss = scan.nextFloat();
            scan.nextLine(); 

            ArrayList<Float> record = new ArrayList<>();
            record.add(wins);
            record.add(loss);

            obj.put(team, record);
        }
        System.out.println("enter team name:");
        String s=scan.nextLine();
      
        	for(Map.Entry<String,ArrayList<Float>> e:obj.entrySet() )
        	{
        		if(s.equals(e.getKey()))
        		{
        			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        			ArrayList<Float> a=e.getValue();
        			Vector<Float>v=new Vector<Float>();
        			for(Float i:a)
        			{
        				v.add(i);
        			}
        			System.out.println((v.get(0)/(v.get(0)+v.get(1)))*100);
        	    }
        	}
       
    }
}
