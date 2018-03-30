package sortstring;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] a=new String[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.next();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if((a[i].length())>(a[j].length()))
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
}}
