package javaproject;
public class addthreearray 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 6, 8, 9, 4, 5, 10, 3,4};
        for (int i = 0; i < arr.length; i += 3)
        {
            System.out.println(arr[i]+arr[i+1]+arr[i+2]);
        }
    }
}
