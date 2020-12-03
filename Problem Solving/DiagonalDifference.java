import java.io.*;
import java.util.*;
import java.lang.*;
class diagonal
{
    static int n;
    static int[][] input()
    {
        Scanner scr=new Scanner(System.in);
        n=scr.nextInt();
        int ar[][]=new int[n][n];
        for(int col=0;col<n;col++)
        {
            for(int row=0;row<n;row++)
            {
                ar[row][col]=scr.nextInt();
            }
        }
        return ar;
    }
    static int diagonalDifference(int[][] arr)
    {
        int lr=0,rl=0;
        for(int col=0;col<n;col++)
        {
            for(int row=0;row<n;row++)
            {
                if(row==col)
                lr+=arr[row][col];
                if((row+col)==(n-1))
                rl+=arr[row][col];
            }
        }
        return Math.abs(rl-lr);
    }
    public static void main(String[] args)
    {
        int[][] arr = input();
        int dd= diagonalDifference(arr);
        System.out.println(dd);
    }
    
    
}