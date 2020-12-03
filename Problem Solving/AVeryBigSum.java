import java.io.*;
import java.util.*;
class VeryBigSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] input=new long[n];
        long sum=0;
        for(int i=0;i<n;i++)
        {
            input[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++)
        {
            sum+=input[i];
        }
        System.out.println(sum);
    }
    
}
