package java_course;

import java.util.Scanner;

public class star_qus
{
    public static void main(String args[]) 
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("enter limit value");
    	int n=scan.nextInt();
        for(int i=1;i<=n; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
