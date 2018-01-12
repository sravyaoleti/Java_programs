package largestamong3;
import java.util.Scanner;
public class Largestamong3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 nos ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int res=(a>b?(a>c?a:c):(b>c?b:c));
        System.out.println("Largest among the 3 nos is   "+res);
    } 
}
