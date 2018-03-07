
package javaapplica;
import java.util.Scanner;
public class JavaApplica {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n1=scan.nextInt();
       int[] a=new int[n1];
       int sum34=0;
       for(int i=0;i<n1;i++)
       {
           a[i]=scan.nextInt();
           sum34+=a[i];
       }
       System.out.println(sum34);
    }
}
