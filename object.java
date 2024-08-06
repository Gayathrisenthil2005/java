package javaproject;
class sevenbyte
{
	int a;
	byte b;
	char c;
}
class object
{
	public static void main(String args[])
	{
		sevenbyte scan=new sevenbyte();
		scan.a=100;
		scan.b=50;
		scan.c='b';
		System.out.println(+scan.a + " " +scan.b + " "+ scan.c+ " ");
	}
}
