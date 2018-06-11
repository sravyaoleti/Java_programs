package bitwise_and;
import java.util.*;
public class Bitwise_and {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n,max=0;
		n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        int t=a[i]&a[j];
		        if(max<t)
		        {
		            max=t;
		        }
		    }
		}
		
		System.out.println(max);
    }
    
}
