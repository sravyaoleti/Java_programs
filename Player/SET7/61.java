/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,x,f=0;
	    n=sc.nextInt();
	    x=sc.nextInt();
	    
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	   
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(a[i]+a[j]==x && i!=j)
	            {
	                System.out.println("Yes");
	                f=1;
	                break;
	            }
	        }
	        if(f==1)
	        {
	            break;
	        }
	    }
	    if(f!=1)
	    {
	        System.out.println("No");
	    }
    }
}
