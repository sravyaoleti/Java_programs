package javaapplication49;
import java.util.Scanner;
public class JavaApplication49 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       int c=s.nextInt();
       int vol=a*b*c;
       int sa=2*((a*b)+(c*b)+(a*c));
       System.out.print(vol+" "+sa);
    }
}
