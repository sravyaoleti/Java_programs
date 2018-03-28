package p12;
import java.util.*;
public class P12 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            b[(i+k)%n]=a[i];
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");  
    }
}
