
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,k,count=0,max=0,t=0;
		n=sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    
		for(int i=0;i<n;i++)
		{
		    count=0;
		    for(int j=i;j<n;j++)
		    {
		        if(a[i]==a[j])
		        {
		            count++;
		        }
		    }
		    if(count>max)
		    {
		        t=a[i];
		        max=count;
		    }
		}
		System.out.println(max);
		
	}
}
