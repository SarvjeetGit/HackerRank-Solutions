import java.io.*;
import java.util.*;
class abc
{
    public static void main(String[] args)
    {
        Scanner scr= new Scanner(System.in);
        int n= scr.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for (int i=0;i<n;i++)
        {
            arr[i]= scr.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];

        }
        System.out.print(sum);
    }
}