package javaapplication49;
import java.util.Scanner;
public class JavaApplication49 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       while(n!=0)
       {
           int dig=n%10;
           System.out.print(dig);
           n/=10;
       }
    }
}
