/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,k=0;
	    n=sc.nextInt();
	    k=sc.nextInt();
	    int[] a=new int[n];
	   
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	    
	        
	        for(int i=0;i<n;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                if(a[i]>a[j])
	                {
	                    int t=a[i];
	                    a[i]=a[j];
	                    a[j]=t;
	                }
	            }
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]<k)
	            System.out.print(a[i]+" ");
	            
	        }
    }
}
