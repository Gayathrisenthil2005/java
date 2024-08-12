package javaproject;
class applform
{
	String name;
	int rollno;
	void display(String str,int num)
	{
		name=str;
		rollno=num;
	}
	void printdisplay()
	{
	System.out.println(name);
	System.out.println(rollno);
	}
}
public class object3
{
	public static void main(String args[])
	{
		applform view=new applform();
		view.name="jannu";
		view.rollno=200;
		System.out.println(view.name);
		System.out.println(view.rollno);
		applform view1=new applform();
		view1.display("gayu",100 );
		view1.printdisplay();
	}
}
