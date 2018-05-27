import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String a,b,x,y;
		int f=0;
		x=sc.next();
		y=sc.next();
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		if(a.length()==b.length())
		{
		    for(int i=0;i<a.length();i++)
		    {
    		    if(a.charAt(i)!=b.charAt(i))
    		    {
    		        System.out.println("NO");
    		        f=1;
    		        break;
    		    }
    		}
    		if(f!=1)
    		{
    		    System.out.println("YES");
    		}
		}
		else
		{
		    System.out.println("NO");
		}
	}
}
