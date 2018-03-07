package javaapplication49;
import java.util.Scanner;
public class JavaApplication49 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       long a=s.nextLong();
       long b=s.nextLong();
       long temp;
       temp=a;
       a=b;
       b=temp;
       System.out.println(a+" "+b);
    }
}
