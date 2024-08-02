package javaproject;
public class elseifelse
{
    public static void main(String[] args) 
    {
        int a = 2;
        int b = 10;
        int c = 20;
        if (a > b && a > c) 
        {
            System.out.println("a greater than b");
        } 
        else if (b > a && b > c)
        {
            System.out.println("b is greater than a and c");
        } 
        else 
        {
            System.out.println("c greater than a and b");
        }

    }
}
