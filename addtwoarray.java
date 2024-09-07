package javaproject;
public class addtwoarray 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 6, 8, 9, 4, 5, 10, 3};
        for (int i = 0; i < arr.length; i += 2)
        {
            System.out.println(arr[i] + arr[i + 1]);
        }
    }
}
