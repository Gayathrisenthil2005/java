package javaproject;
public class Threading1 implements Runnable
{
	public void run() 
	{
		System.out.println("Thread is called"+" "+Thread.currentThread().getName());
		String name=Thread.currentThread().getName();
		if(name.equalsIgnoreCase("First Thread"))
		{
			for(int i=100;i<=200;i=i+1)
			{
				System.out.println("first thread"+i);
			}
		}
		else if(name.equalsIgnoreCase("Second Thread"))
		{
			for(int i=200;i<=300;i=i+1)
			{
				System.out.println("second thread"+i);
			}
			
		}
		else if(name.equalsIgnoreCase("Third Thread"))
		{
			for(int i=301;i<=400;i=i+1)
			{
				System.out.println("third thread"+i);
			}
		}
		else if(name.equalsIgnoreCase("Fourth Thread"))
		{
			for(int i=401;i<=500;i=i+1)
			{
				System.out.println("fourth thread"+i);
			}
		}
	}
	public static void main(String args[])
	{
		Threading1 s1=new Threading1();
		Thread S1=new Thread(s1);
		S1.setName("First Thread");
		S1.start();
		Threading1 s2=new Threading1();
		Thread S2=new Thread(s2);
		S2.setName("Second Thread");
		S2.start();
		Threading1 s3=new Threading1();
		Thread S3=new Thread(s3);
		S3.setName("Third Thread");
		S3.start();
		Threading1 s4=new Threading1();
		Thread S4=new Thread(s4);
		S4.setName("Fourth Thread");
		S4.start();
		
	}
}
