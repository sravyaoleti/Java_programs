package check;

import java.util.Scanner;

public class Ck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ip=sc.nextLine();
		System.out.println(ip.replaceAll(" ", ""));
	}
}
