package pkg44.java;
import java.util.*;
import java.lang.*;
//System.out.println();
public class Java {
    public static void main(String[] args) {
         Scanner a=new Scanner(System.in);
         String str=a.nextLine();
         int f=0;
         for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                     {
                         System.out.println("Yes");
                         f=1;
                         break;
                     }
         }
         if(f==0)
         {
             System.out.println("No");
         }  
    }  
}
