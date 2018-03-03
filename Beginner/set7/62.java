package pkg44.java;
import java.util.*;
//System.out.println();
public class Java {
    public static void main(String[] args) {
         Scanner a=new Scanner(System.in);
         String n=a.next();
         int len=n.length();
         int f=0;
         for(int i=0;i<len;i++)
         {
             if(n.charAt(i)!='1' && n.charAt(i)!='0' )
             {
                 f=1;
                 break;
             }
             
         }
         if(f==1)
         {
             System.out.println("No");
         }
         else
         {
             System.out.println("Yes");
         }
    } 
    
}
