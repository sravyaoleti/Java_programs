package pkg44.java;
import java.util.*;
//System.out.println();
public class Java {
    public static void main(String[] args) {
         Scanner a=new Scanner(System.in);
         int n=a.nextInt();
         int cond=1;
         if(n%10==0)
         {
             System.out.println(n);
         }
         else
         {
             while(cond!=0)
             {
                 n++;
                 if(n%10==0)
                 {
                     System.out.println(n);
                     cond=0;
                 }
             }
         }
    }  
}
