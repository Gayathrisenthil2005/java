package javaproject;
public class construct
{
	int a;
	int b;
	int c;
    construct()
	{
		System.out.println("constructor");
	}
    construct(int a,float b)
    {
    	System.out.println(a+" "+b);
    }
    construct(int x,int y,int z)
    {
    	a=x;
    	b=y;
    	c=z;
    }
    void display()
    {
    	System.out.println(a+" "+b+" "+c);
    }
    public static void main(String args[])
    {
    	construct type1=new construct();
    	construct type2=new construct(20,30.55f);
    	construct type3=new construct(20,30,40);
    	type3.display();
     }
}
