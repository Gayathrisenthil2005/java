package javaproject;
import static java.lang.Math.*;
import java.util.*;
public class eg10loop {
    public static void main(String[] args) {
        double Sum=0;
        double x=2;
        double y;
        int f=0;
       for(int j=0;j<4;j++)
        {
            int fact=1;
            for(int i=1;i<=j;i++)
            {
                fact=fact*i;
            }
            y=Math.pow(x,j)/fact;
            if(f==0){
                Sum=Sum+y;
                f=1;
            }
            else{
                Sum=Sum-y;
                f=0;
            }
            
          
        }
        
        
        System.out.println(Sum);
    

    }
}
