import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int k=0;k<n;k++)
        {
            a[k]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int t=a[i];
            a[i]=a[i+1];
            a[i+1]=t;
            i++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }   
    }
}
