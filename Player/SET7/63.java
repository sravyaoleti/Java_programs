/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,t=0;
	    n=sc.nextInt();
	    
	    int[] a=new int[n];
	    int[] b=new int[n];
	    
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	    
	     for(int i=0;i<n;i++)
	        b[i]=sc.nextInt();
	        
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                if(a[i]==b[j] && a[i]!=t)
	                {
	                    System.out.print(a[i]+" ");
	                    t=a[i];
	                }
	                
	            }
	        }
    }
}
//System.out.print(b[i]+" ");
