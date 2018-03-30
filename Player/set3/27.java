package togglecase;

import java.util.Scanner;

public class Up_low {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ip=sc.nextLine();
		char[] a=ip.toCharArray();
		for(int i=0;i<ip.length();i++)
		{
			if(Character.isUpperCase(a[i]))
			{
				a[i]=Character.toLowerCase(a[i]);
			}
			else 
			{
				a[i]=Character.toUpperCase(a[i]);
			}
		}
		String op=new String (a);
		System.out.println(op);
	}
}
