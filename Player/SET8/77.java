/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,count=1,f=0,max=0;
		n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    
		for(int i=1;i<n;i++)
		{
		    if(a[i-1]<a[i])
		    {
		        count++;
		    }
		    else
		    {
		        if(max<count)
		        {
		            max=count;
		        }
		        count=1;
		    }
		}
		if(count>max)
		{
		     System.out.println(count);
		}
		else
		{
		    System.out.println(max);
		}
       
	}
}
