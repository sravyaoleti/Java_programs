package hello;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=b.charAt(i))
			{
				count++;
			}
		}
		if(count==k)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
