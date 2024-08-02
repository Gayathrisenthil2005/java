package javaproject;
public class nestedif
{
	public static void main(String args[])
	{
		int a = 30;
		int b = 10;
		int c = 20;
		if (a < b && a < c) 
	  {
	     System.out.println(a);
		 if (b < c) 
		 {
			 System.out.println("" + b + " " + c);
		 }
		 else
		 {
			 System.out.println("" + c + " " + b);
		 }
	   } 
		else if (b < a && b < c)
		{
			System.out.println(b);
		     if (a < c)
		     {
		      System.out.println("" + a + " " + c);
		     } 
		     else 
		     {
		      System.out.println("" + c + " " + a);
		      }
		 } 
		else if (c < a && c < b) 
		{
		  System.out.println(c);
		   if (a < b) 
		   {
		    System.out.println("" + a + " " + b);
		   } 
		   else 
		   {
		    System.out.println("" + b + " " + a);
		   }
		 }
	}
}
