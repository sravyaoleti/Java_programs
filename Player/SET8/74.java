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
		String str;
		int f=0;
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<str.length();j++)
		    {
		        if(str.charAt(i)==str.charAt(j))
		        {
		            System.out.println("YES");
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
		    System.out.println("NO");
		}
		
	}
}
