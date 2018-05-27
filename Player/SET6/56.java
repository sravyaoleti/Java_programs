
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String a;
		char k;
		a=sc.next();
		k=sc.next().charAt(0);
		    for(int i=0;i<a.length();i++)
		    {
    		    if(a.charAt(i)==k)
    		    {
    		        System.out.println(i+1);
    		        break;
    		    }
    		}

	}
}
