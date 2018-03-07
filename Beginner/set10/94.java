
package javaapplication49;
import java.util.Scanner;
public class JavaApplication49 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int k=s.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=s.nextInt();
       }
       boolean f=false;
       for(int i=0;i<n;i++)
       {
           if(a[i]==k)
           {
               System.out.println(k);
               f=true;
               break;
           }
       }
       boolean x=false;
       if(f==false)
       {
           while(true)
           {
               k++;
             for(int i=0;i<n;i++)
               {
                if(a[i]==k)
                {
                    System.out.println(k);
                    x=true;
                    break;
                }
            }  
             if(x)
             {
                 break;
             }
           }
       } 
    }
}
