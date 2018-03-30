
import java.util.*;
public class String_is_numeric {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ip=sc.nextLine();
		String op=ip.replaceAll("[0-9]", "");
		if(op.length()==0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
