/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,res=0;
	    n=sc.nextInt();
	    
	    for(int i=1;i<=n;i++)
	    {
	        if((n%i==0))
	        {
	            res=n/i;
	            if(res%2==1)
	            {
	                System.out.println(i);
	                break;
	            }
	        }
	    }
    }
}
