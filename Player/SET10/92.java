import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dig=0,i=0,j=0;
        int[] a=new int[50];
        while(n!=0)
        {
            dig=n%10;
            int c=(int)Math.pow(2,i);
            a[j]=(dig*c);
            i++;j++;
            n=n/10;
        }
        int sum=0;
        for(int k=0;k<j;k++)
        {
           sum+=a[k]; 
        }
        System.out.println(sum);
        
    }
}
