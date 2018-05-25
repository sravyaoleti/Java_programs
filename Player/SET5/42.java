
package pl42;
import java.util.Scanner;
public class Pl42 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n,flag=0;
        n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=1;i<n;i++)
        {
            if(a[i-1]<a[i])
            {
                flag=0;
            }
            else
            {
                flag=1;
                System.out.println("NO");
                break;
            }
        }
        if(flag!=1)
        {
             System.out.println("YES");
        }
    }
    
}
