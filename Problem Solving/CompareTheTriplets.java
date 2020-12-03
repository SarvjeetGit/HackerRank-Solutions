import java.io.*;
import java.util.*;
class abcd
{
    static int[] a=new int[3];
    static int[] b=new int[3];
    static Scanner scr = new Scanner(System.in);
    public static void main(String[] args)
    {
        int ca=0,cb=0;
       alice();
       bob();
       for(int i=0;i<3;i++)
       {
          if(a[i]>b[i])
          ca++;
          else if(a[i]<b[i])
          cb++;
          else continue;
       }
       int res[]={ca,cb};
       System.out.print(res[0]+" "+res[1]);

    }
    public static void alice()
    {
        a[0] = scr.nextInt();
        a[1] = scr.nextInt();
        a[2] = scr.nextInt();
    }
    public static void bob()
    {
        b[0] = scr.nextInt();
        b[1] = scr.nextInt();
        b[2] = scr.nextInt();
    }

}

