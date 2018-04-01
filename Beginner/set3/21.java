package ap;

import java.util.Scanner;

public class Ap {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		
		int series=0,sum=0;
		for(int i=0;i<n;i++)
		{
			series=a+(i*d);
			sum=sum+series;
		}
		System.out.println(sum);
		
	}
}
