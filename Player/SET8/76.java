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
		int n,eve=0,odd=0,tempo=0,tempe=0;
		n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    
		for(int i=0;i<n;i++)
		{
		   if(a[i]%2==0)
		   {
		       eve++;
		       tempe=a[i];
		   }
		   else
		   {
		       odd++;
		       tempo=a[i];
		}
		}
		if(odd==1)
    		{
    		  System.out.println(tempo); 
    		}
    		else
    		{
    		    System.out.println(tempe); 
    		}
	}
}
