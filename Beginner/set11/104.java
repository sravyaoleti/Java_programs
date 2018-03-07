package javaapplication50;
import java.util.Scanner;
public class JavaApplication50 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int p=s.nextInt();
       int i=1,pow=1;
       while(i<=p)
       {
           pow*=n;
           ++i;  
       }
  System.out.println(pow);
    }
}
