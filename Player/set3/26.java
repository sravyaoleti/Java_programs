package check;

import java.util.Scanner;

public class Ck {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		s=sc.nextLine();
		System.out.println(s.replaceAll(" +", " "));
	}
}
