package javaproject;
class sevenbyte1
{
	int a;
	byte b;
	short c;
void data(int x,short z,byte y)
{
	a=x;
	b=y;
	c=z;
}
void printdata()
{
	System.out.println(a+ " "+b +" " +c);
}
}
class object2
{
	public static void main(String args[])
	{
		sevenbyte1 scan=new sevenbyte1();
		scan.a=100;
		scan.b=50;
		scan.c=125;
		System.out.println(+scan.a + " " +scan.b + " "+ scan.c+ " ");
		sevenbyte1 scan1=new sevenbyte1();
		scan1.data(200,(short)80,(byte)120);
		scan1.printdata();
	}
}
