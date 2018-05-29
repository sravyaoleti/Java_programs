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
		int ac,bc;
		ac=sc.nextInt();
		bc=sc.nextInt();
		int[] a=new int[ac];
		int[] b=new int[bc];
		int[] c=new int[ac+bc+5];
		
		for(int i=0;i<ac;i++)
		{
		    a[i]=sc.nextInt();
		    c[i]=a[i];
		}
		    
		
		for(int i=0;i<bc;i++)
		{
		    b[i]=sc.nextInt();
		    c[i+ac]=b[i];
		}
		    
		    
		for(int i=0;i<(ac+bc);i++)
		{
		    for(int j=i+1;j<(ac+bc);j++)
		    {
		        if(c[i]>c[j])
		        {
		            int t=c[i];
		            c[i]=c[j];
		            c[j]=t;
		        }
		    }
		}
		
		for(int i=0;i<(ac+bc);i++)
		{
		    System.out.print(c[i]+" ");
		}
		
       
	}
}
