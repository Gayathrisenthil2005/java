package javaproject;
public class Threading implements Runnable
{
	public void run() 
	{
		System.out.println("Thread is called"+" "+Thread.currentThread().getName());
		String name=Thread.currentThread().getName();
		if(name.equalsIgnoreCase("First Thread"))
		{
			for(int i=10;i<=20;i=i+1)
			{
				System.out.println("first thread"+i);
			}
		}
		else
		{
			for(int i=30;i<=40;i=i+1)
			{
				System.out.println("second thread"+i);
			}
			
		}
	}
	public static void main(String args[])
	{
		Threading s1=new Threading();
		Thread S1=new Thread(s1);
		S1.setName("First Thread");
		S1.start();
		Threading s2=new Threading();
		Thread S2=new Thread(s2);
		S2.setName("second Thread");
		S2.start();
	}
}
